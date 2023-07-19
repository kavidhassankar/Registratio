package com.demo.Student.Registration.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.demo.Student.Registration.enumeration.ParentDetailsType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_kavi_studentparent_details")

public class StudentParentDetails extends RecordModifier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "designation")
	private String designation;
	
	@Column(name = "organization_name")
	private String organizationName;

	@Column(name = "annual_income")
	private String annualIncome;

	@Enumerated(EnumType.STRING)
	@Column(name = "parent_details_type")
	private ParentDetailsType parentDetailsType;
	
	@Type(type = "uuid-char")
	@Column(name="ocupat_id")
	private UUID occupationId;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "studt_registration_id", nullable = false, insertable = false, updatable = false)
	private Student studeId;

}

