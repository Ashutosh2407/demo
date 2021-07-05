package com.example.proj1.model;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Student {
	@Id
	private int s_id;
	private String name;
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
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
		return "Student [s_id=" + s_id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
}
