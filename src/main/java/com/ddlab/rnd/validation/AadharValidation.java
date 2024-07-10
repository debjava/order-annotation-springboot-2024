package com.ddlab.rnd.validation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.vo.CoreData;

@Component
@Order(2)
public class AadharValidation implements Validation {

	@Override
	public boolean validate(CoreData data) {
		String aadharNo = data.getAadharNo();
		System.out.println("Validating Aadhar No: "+aadharNo);
		return true;
	}
}
