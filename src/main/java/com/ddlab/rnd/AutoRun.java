package com.ddlab.rnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.handler.Handler;
import com.ddlab.rnd.notification.Notifier;
import com.ddlab.rnd.validation.Validation;
import com.ddlab.rnd.vo.CoreData;


@Component
public class AutoRun {
	
	@Autowired
	private List<Validation> valdnList;
	
	@Autowired
	private List<Notifier> notificationList;
	
	@Autowired
	private List<Handler> handlers;
	
	public void check1() {
		CoreData data = new CoreData();
		data.setAadharNo("AA-123456-7890");
		data.setPassportNo("PP-45893-332");
		data.setPanNo("P-78WSD-934");
		valdnList.forEach( vldn -> System.out.println("Output From Valditation: "+vldn.validate(data)));
	}
	
	public void check2() {
		String message = "Account created successfully ...";
		notificationList.forEach( val -> val.notify(message));
	}
	
	public void check3() {
		handlers.forEach( handler -> handler.handle());
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void run() {
		System.out.println("Application running ...");
//		check1();
//		check2();
		check3();
	}

}
