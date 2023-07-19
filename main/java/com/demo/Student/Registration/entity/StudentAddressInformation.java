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

import com.demo.Student.Registration.enumeration.AddressType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_kavi_student_addrs")

public class StudentAddressInformation extends RecordModifier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Type(type = "uuid-char")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;


	// @NotNull(message = "student address cannot be blank")
	@Column(name = "address")
	private String address;

	// @NotNull(message = "student pincode cannot be blank")
	@Column(name = "pin_code")
	private String pinCode;

	@Type(type = "uuid-char")
	@Column(name = "country_id")
	private UUID countryId;

	@Type(type = "uuid-char")
	@Column(name = "state_id")
	private UUID stateId;

	@Type(type = "uuid-char")
	@Column(name = "city_id")
	private UUID cityId;

	// @NotNull(message = "AddressType cannot be blank")
	@Enumerated(EnumType.STRING)
	@Column(name = "address_type")
	private AddressType addressType;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "studt_registration_id", nullable = false, insertable = false, updatable = false)
	private Student studeObId;

}
