package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class SignupEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="emailid")
	private String emailid;
	@Column(name="phno")
	private long phno;
	@Column(name="password")
	private String password;
	@Column(name="confirmpassword")
	private String confirmpassword;
	
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public SignupEntity() {
	super();
}
public SignupEntity(int id, String firstname, String lastname, String emailid, long phno, String password,
		String confirmpassword) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailid = emailid;
	this.phno = phno;
	this.password = password;
	this.confirmpassword = confirmpassword;
	
}
   
   public String getFirstname() 
   {
	return firstname;
   }
   public void setFirstname(String firstname) 
   {
	this.firstname = firstname;
   }
   public String getLastname() 
   {
	return lastname;
   }
   public void setLastname(String lastname) 
   {
	this.lastname = lastname;
   }
   public String getEmailid() 
   {
	return emailid;
   }
   public void setEmailid(String emailid) 
   {
	this.emailid = emailid;
   }
   public long getPhno() 
   {
	return phno;
   }
   public void setPhno(long phno) 
   {
	this.phno = phno;
   }
   public String getPassword() 
   {
	return password;
   }
   public void setPassword(String password)
   {
	this.password = password;
   }
   public String getConfirmpassword() 
   {
	return confirmpassword;
   }
   public void setConfirmpassword(String confirmpassword) 
   {
	this.confirmpassword = confirmpassword;
   }
   
   
}
