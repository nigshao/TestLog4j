package com.atguigu.dao;

public class Person {
	private  String personName;
	private  Integer id;
	public Person(String personName) {
		super();
		this.personName = personName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

	
}
