package com.ddlab.rnd.validation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.vo.CoreData;

@Component
@Order(2)
public class PassportValidation implements Validation {

	@Override
	public boolean validate(CoreData data) {
		String passportNo = data.getPassportNo();
		System.out.println("Validating Passport No: "+passportNo);
		return true;
	}
}
