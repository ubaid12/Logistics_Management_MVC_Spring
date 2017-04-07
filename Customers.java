package com.mkyong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Customers")

public class Customers {
	
	@Id
	@Column(name ="Customer_ID")
	private Long id;
	private String Name;
	private String email;
	private String ContactNo;
	private int Age;
	private String Gender;
	private String Occupation;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String ShowAll()
	{
		return ("id = " + id+ "Name = "+Name+ "Email = "+ email+ "Contact No= "+ContactNo+"Age = "+Age+ "Gender = "+Gender+ "Occupation = "+Occupation);
	}
	

}
