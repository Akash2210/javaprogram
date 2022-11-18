package com.springhibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


@Id

	private  int u_Id;
	private String  u_Name;
	private String u_Password;
     private String u_dob;
     
     public User(int u_Id, String u_Name, String u_Password, String u_dob) {
 		super();
 		this.u_Id = u_Id;
 		this.u_Name = u_Name;
 		this.u_Password = u_Password;
 		this.u_dob = u_dob;
 	}
 	
     public User() {
     		super();
     		// TODO Auto-generated constructor stub
     	}
     
	
	public int getU_Id() {
		return u_Id;
	}
	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}
	public String getU_Name() {
		return u_Name;
	}
	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	public String getU_Password() {
		return u_Password;
	}
	public void setU_Password(String u_Password) {
		this.u_Password = u_Password;
	}
	public String getU_dob() {
		return u_dob;
	}
	public void setU_dob(String u_dob) {
		this.u_dob = u_dob;
	}
	
	@Override
	public String toString() {
		return "User [u_Id=" + u_Id + ", u_Name=" + u_Name + ", u_Password=" + u_Password + ", u_dob=" + u_dob + "]";
	}
	
	
	}
	

