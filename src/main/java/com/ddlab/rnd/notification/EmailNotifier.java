package com.ddlab.rnd.notification;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmailNotifier implements Notifier {
	@Override
	public void notify(String message) {
		System.out.println(message + " sent on email to the user");
	}
}
