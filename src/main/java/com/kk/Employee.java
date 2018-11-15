package com.kk;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	private Long id;

	@Column(name = "EMP_FULL_NAME")
	private String name;

	@Column(name = "LOCATION_ZIP")
	private Integer locationZip;

	@Column(name = "STATE")
	private String state;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "IS_ACTIVE")
	private Character isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getLocationZip() {
		return locationZip;
	}

	public void setLocationZip(Integer locationZip) {
		this.locationZip = locationZip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", locationZip=" + locationZip + ", state=" + state
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", isActive=" + isActive + "]";
	}

	

}
