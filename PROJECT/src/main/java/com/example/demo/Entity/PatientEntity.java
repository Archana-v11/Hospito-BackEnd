package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class PatientEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int id;

	@Column(name="name")
    private String name;
	@Column(name="age")
    private int age;
	@Column(name="phno")
    private long phno;
	@Column(name="gender")
    private String gender;
	@Column(name="problem")
    private String problem;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public long getPhno() 
	{
		return phno;
	}
	public void setPhno(long phno) 
	{
		this.phno = phno;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getProblem() 
	{
		return problem;
	}
	public void setProblem(String problem) 
	{
		this.problem = problem;
	}
    
	public PatientEntity() {
		super();
	}
	public PatientEntity(int id, String name, int age, long phno, String gender, String problem) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.gender = gender;
		this.problem = problem;
	}
}
