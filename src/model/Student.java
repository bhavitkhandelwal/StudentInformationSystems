package model;

import java.time.LocalDate;

public class Student {
	private int rollNo;
	private String name;
	private LocalDate dateofBirth;
	private Qualification qualification;
	private String phoneNo;
	private String email;
	private String address;
	public static final String collegeName="LTI College";
	private static int rollNoGenerator=0;
	
	

	public Student() {}
	
	public Student(String name,LocalDate dateofBirth,  Qualification qualification ,String phoneNo,String email, String address )
	{
//		Pointer to current objecte
//		The this keyword refers to the current object in a method or constructor.
		this.rollNo=++rollNoGenerator;
		this.name=name;
		this.dateofBirth=dateofBirth;
		this.qualification = qualification;
		this.phoneNo=phoneNo;
		this.email=email;
		this.address=address;
		
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static String getCollegename() {
		return collegeName;
	}
	
	
	
}


