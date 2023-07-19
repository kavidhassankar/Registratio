package com.demo.Student.Registration.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.demo.Student.Registration.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "modifiedOn", "createdOn", "deletedOn", "deletedBy", "modifiedBy", "createdBy"})
public abstract  class RecordModifier {
	
	@CreatedBy
	@Column(name = "created_by", nullable = false, updatable = false)
	private String createdby;
	
	@CreatedDate
	@Column(name = "created_on", nullable = false, updatable = false)
	private LocalDateTime createdOn;
	
	@LastModifiedBy
	@Column(name = "modified_by", nullable = false)
	private String modifiedBy;
	
	@LastModifiedDate
	@Column(name = "modified_on", nullable = false)
	private LocalDateTime modifiedOn;
	
	@Column(name = "deleted_on")
	private Date deletedOn;
	
	@Column(name = "deleted_by")
	private String deletedBy;
	
	@NotNull(message = "Status cannot be null")
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;

	
	

}
