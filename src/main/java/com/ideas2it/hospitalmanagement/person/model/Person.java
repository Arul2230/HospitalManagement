package com.ideas2it.hospitalmanagement.person.model;

import java.util.Date;

import com.ideas2it.hospitalmanagement.address.model.Address;
import com.ideas2it.hospitalmanagement.commons.Constants;


import org.springframework.format.annotation.DateTimeFormat;

/**
 * Person class is the Entity class is having the getters and setter methods
 * which is used to get the values from the user. This class acts as an Model
 * for the Person Details.
 *
 * @author  Arul Murugan
 * @version 1.0
 */
public class Person {

	private Integer id ;
    private String firstName;
    private String lastName;
    private String emailId;
	private Long mobileNumber;
    private String role;
    private Date birthDate;
    private Address address = new Address();
    private boolean active;

    public enum Gender{
        Male,
        Female,
        Transgender;

    	private String gender;
 
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

    public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    @DateTimeFormat(pattern = Constants.REVERSED_DATE_FORMAT)
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}