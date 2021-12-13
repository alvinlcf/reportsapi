package com.sgkinc.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

import com.sgkinc.enums.OutcomeStatus;

/**
 * Contains the base level properties like status, errors, createdDate and
 * modifiedDate
 * 
 */
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Map<String, String> errors;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	private boolean deleted;
	private OutcomeStatus status = OutcomeStatus.SUCCESS;
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public OutcomeStatus getStatus() {
		return status;
	}

	public void setStatus(OutcomeStatus status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}