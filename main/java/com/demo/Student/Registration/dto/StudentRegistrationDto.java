package com.demo.Student.Registration.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.Email;

import com.demo.Student.Registration.enumeration.GenderType;
import com.demo.Student.Registration.enumeration.MaritalStatusType;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRegistrationDto {

	private UUID id;
	private String firstName;
	private String middleName;
	private String lastName;
	private MaritalStatusType maritalStatus;
	private GenderType genders;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	@Email
	private String emailId;
	private String mobileNumber;
	private String birthPlace;
	private UUID birthStateid;
	private String identityMark;
	private UUID domicileCountryid;
	private UUID domicileStateId;

	private UUID motherTongId;
	private String aadharNumber;
	private UUID nationalityId;
	private UUID religionId;
	private UUID casteId;
	private UUID categoryId;
	private String registrationNumber;
	private UUID academicYearId;
	private UUID standId;
	private UUID sectionId;
	private String rollNumber;
	
	private List<StudentAddressDto>studentAdmissionList;

	private List<ParentAddressDto>parentAddressList;

//	private UUID admissionCategoryId;
//	private UUID admissionSectionId;
//	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/mm/yyyy")
//	private Date dateOfAdmission;
//	private String rollNumber;
//	private UUID admissionStandardId;
	

	

	
	

}