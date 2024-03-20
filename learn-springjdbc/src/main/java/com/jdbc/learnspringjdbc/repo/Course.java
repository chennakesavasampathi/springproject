package com.jdbc.learnspringjdbc.repo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
private int id;
	@Column
private String name;
	@Column
private String add;


public Course() {
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", add=" + add + "]";
}
public Course(int id, String name, String add) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
}

}
