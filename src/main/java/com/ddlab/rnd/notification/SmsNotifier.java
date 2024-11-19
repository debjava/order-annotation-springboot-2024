package com.ddlab.rnd.notification;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SmsNotifier implements Notifier {
	@Override
	public void notify(String message) {
		System.out.println(message + " sent via sms to the user");
	}
}
