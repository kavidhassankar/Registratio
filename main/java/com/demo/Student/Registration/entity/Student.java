package com.demo.Student.Registration.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.demo.Student.Registration.enumeration.GenderType;
import com.demo.Student.Registration.enumeration.MaritalStatusType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_kavi_stude")

public class Student extends RecordModifier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "marital_status")
	private MaritalStatusType maritalStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private GenderType genders;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "email_id")
	private String emailId;

	// @NotNull(message = "mobileNumber cannot be blank")

	@Column(name = "mobile_number")
	private String mobileNumber;

	// @NotNull(message = "birthPlace cannot be blank")

	@Column(name = "birth_Place")
	private String birthPlace;

	@Type(type = "uuid-char")
	@Column(name = "birth_state_id")
	private UUID birthStateid;

	@Column(name = "identity_mark")
	private String identityMark;

	@Type(type = "uuid-char")
	@Column(name = "domicile_country_id")
	private UUID domicileCountryid;

	@Type(type = "uuid-char")
	@Column(name = "domicile_state_id")
	private UUID domicileStateId;

	@Type(type = "uuid-char")
	@Column(name = "mother_tongue_id")
	private UUID motherTongId;

	@Column(name = "aadhar_number")
	private String aadharNumber;

	@Type(type = "uuid-char")
	@Column(name = "nationality_id")
	private UUID nationalityId;

	@Type(type = "uuid-char")
	@Column(name = "religion_id")
	private UUID religionId;

	@Type(type = "uuid-char")
	@Column(name = "caste_id")
	private UUID casteId;

	@Type(type = "uuid-char")
	@Column(name = "category_id")
	private UUID categoryId;

	@Column(name = "registration_number")
	private String registrationNumber;

	// @NotNull(message = "registrationNumber cannot be blank")

	@Type(type = "uuid-char")
	@Column(name = "academic_year_id")
	private UUID academicYearId;

	@Type(type = "uuid-char")
	@Column(name = "standard_id")
	private UUID standId;

	@Type(type = "uuid-char")
	@Column(name = "section_id")
	private UUID sectionId;


	@Column(name = "roll_number")
	private String rollNumber;
	
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "studt_registration_id", referencedColumnName = "id", nullable = false)
	private List<StudentAddressInformation> stuAddobj;
	
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "studt_registration_id", referencedColumnName = "id", nullable = false)
	private List<StudentParentDetails> stuParentDetailsObj;


	
//	@JoinColumn(name = "admission_category_id")
//	private UUID admissioId;

	
}
