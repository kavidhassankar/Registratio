package com.demo.Student.Registration.dto;

import java.util.UUID;

import com.demo.Student.Registration.enumeration.ParentDetailsType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentAddressDto {

	private UUID id;
	private UUID registrationId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private UUID occupationId;
	private String designation;
	private String organizationName;
	private String annualIncome;
	private ParentDetailsType parentDetailsType;
	

}
