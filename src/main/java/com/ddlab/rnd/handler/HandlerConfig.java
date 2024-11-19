package com.ddlab.rnd.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class HandlerConfig {
	
	@Bean @Order(1)
	public AccountHandler savings() {
		return new AccountHandler("1234", "Savings");
	}
	
	@Bean @Order(2)
	public AccountHandler loan() {
		return new AccountHandler("1234", "Loan");
	}
	
	@Bean @Order(3)
	public AccountHandler demat() {
		return new AccountHandler("1234", "Demat");
	}

}
