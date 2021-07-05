package com.example.proj1.model;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Student {
	@Id
	private int s_id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", s_id=" + s_id + "]";
	}
	
	
}
