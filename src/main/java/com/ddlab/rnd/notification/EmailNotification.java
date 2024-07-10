package com.ddlab.rnd.notification;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmailNotification implements Notification {
	@Override
	public void send(String message) {
		System.out.println(message + " sent on email to the user");
	}
}
