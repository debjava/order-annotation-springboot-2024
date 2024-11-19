package com.ddlab.rnd.handler;

import lombok.Data;

@Data
public class AccountHandler implements Handler {
	
	private String accountNo;
	private String type;
	
	public AccountHandler(String accountNo, String type) {
		this.accountNo = accountNo;
		this.type = type;
	}

	@Override
	public void handle() {
		System.out.println("Checking the account for account no: "+accountNo+" of type: "+type);
	}

}
