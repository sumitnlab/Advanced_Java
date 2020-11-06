package com.dev.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.dev.dto.Device;

@Service
public class DeviceLoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz){
		
		return clazz.equals(Device.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","unmKey", "Please provide valid Username");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass", "passKey","Please provide valid Password");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "ekey", "Email Required");
		
		System.out.println("Hello Error");
		
		Device device = (Device)target;
		if(device.getUserPass()!=null) {
			if(device.getUserPass().length()<3) { 
				errors.rejectValue("userPass", "passKey", "Password should contain more than 2 character");
			}
		}
		
		
	}

}
