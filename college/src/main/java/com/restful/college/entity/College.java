package com.restful.college.entity;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class College {

	@Id
	private int sno;
	@Column
	private String sname;
	@Column
	private String sadd;
	@Column
	private String school;
	@Column
	private int sage;
	@Column
	private float salary;
	@Column
	private  Calendar hiredate;
	
	public College() {
		
		
	}
	
	@Override
	public String toString() {
		return "College [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", school=" + school + ", sage=" + sage
				+ ", salary=" + salary + ", hiredate=" + hiredate + "]";
	}

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Calendar getHiredate() {
		return hiredate;
	}
	public void setHiredate(Calendar hiredate) {
		this.hiredate = hiredate;
	}
	public College(int sno, String sname, String sadd, String school, int sage, float salary, Calendar hiredate) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.school = school;
		this.sage = sage;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	
	
	
	
	
	
  
	
}
