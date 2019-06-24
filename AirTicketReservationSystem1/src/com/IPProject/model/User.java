package com.IPProject.model;
import java.util.Date;

public class User {
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String fatherName;
	private String sex;
	private int adultNo;
	private int childrenNo;
	private int infantsNo;
	private String phone;
	private Date dateOfBirth;
	
	public User() {
		
	}

	public User(String emailId, String password, String firstName, String lastName, String address) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public User(String fatherName, String sex, int adultNo, int childrenNo, int infantsNo, String phone,
			Date dateOfBirth) {
		super();
		this.fatherName = fatherName;
		this.sex = sex;
		this.adultNo = adultNo;
		this.childrenNo = childrenNo;
		this.infantsNo = infantsNo;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}
	
	

	public User(String emailId, String fatherName, String sex, int adultNo, int childrenNo, int infantsNo, String phone,
			Date dateOfBirth) {
		super();
		this.emailId = emailId;
		this.fatherName = fatherName;
		this.sex = sex;
		this.adultNo = adultNo;
		this.childrenNo = childrenNo;
		this.infantsNo = infantsNo;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String emailId, String password, String firstName, String lastName, String address, String fatherName,
			String sex, int adultNo, int childrenNo, int infantsNo, String phone, Date dateOfBirth) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.fatherName = fatherName;
		this.sex = sex;
		this.adultNo = adultNo;
		this.childrenNo = childrenNo;
		this.infantsNo = infantsNo;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAdultNo() {
		return adultNo;
	}

	public void setAdultNo(int adultNo) {
		this.adultNo = adultNo;
	}

	public int getChildrenNo() {
		return childrenNo;
	}

	public void setChildrenNo(int childrenNo) {
		this.childrenNo = childrenNo;
	}

	public int getInfantsNo() {
		return infantsNo;
	}

	public void setInfantsNo(int infantsNo) {
		this.infantsNo = infantsNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + ", fatherName=" + fatherName + ", sex=" + sex + ", adultNo="
				+ adultNo + ", childrenNo=" + childrenNo + ", infantsNo=" + infantsNo + ", phone=" + phone
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
