package com.saiko.sample.student.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String full_name;
	private String branch;
	private long mobile_number;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", full_name=" + full_name + ", branch=" + branch + ", mobile_number="
				+ mobile_number + ", city=" + city + "]";
	}

	public Student(int id, String full_name, String branch, long mobile_number, String city) {
		this.id = id;
		this.full_name = full_name;
		this.branch = branch;
		this.mobile_number = mobile_number;
		this.city = city;
	}

	public Student() {
	}
}
