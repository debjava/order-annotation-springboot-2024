package com.ddlab.rnd.validation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.vo.CoreData;

@Component
@Order(3)
public class PanValidation implements Validation {

	@Override
	public boolean validate(CoreData data) {
		String panNo = data.getPassportNo();
		System.out.println("Validating PAN No: " + panNo);
		return true;
	}
}
