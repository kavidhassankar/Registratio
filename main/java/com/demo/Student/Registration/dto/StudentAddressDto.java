package com.demo.Student.Registration.dto;

import java.util.UUID;

import com.demo.Student.Registration.entity.City;
import com.demo.Student.Registration.entity.Country;
import com.demo.Student.Registration.entity.State;
import com.demo.Student.Registration.enumeration.AddressType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentAddressDto {
	private UUID Id;
	private UUID studentRegistrId;
	private String address;
	private String pinCode;
	private Country countryId;
	private State stateId;
	private City cityId;
	private AddressType addressType;

}
