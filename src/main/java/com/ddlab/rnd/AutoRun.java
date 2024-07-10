package com.ddlab.rnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.notification.Notification;
import com.ddlab.rnd.validation.Validation;
import com.ddlab.rnd.vo.CoreData;


@Component
public class AutoRun {
	
	@Autowired
	private List<Validation> valdnList;
	
	@Autowired
	private List<Notification> notificationList;
	
	public void check1() {
		CoreData data = new CoreData();
		data.setAadharNo("AA-123456-7890");
		data.setPassportNo("PP-45893-332");
		data.setPanNo("P-78WSD-934");
		valdnList.forEach( vldn -> System.out.println("Output From Valditation: "+vldn.validate(data)));
	}
	
	public void check2() {
		String message = "Account created successfully ...";
		notificationList.forEach( val -> val.send(message));
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void run() {
		System.out.println("Application running ...");
		check1();
		check2();
	}

}
