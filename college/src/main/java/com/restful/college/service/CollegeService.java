package com.restful.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.college.entity.College;
import com.restful.college.repository.CollegeOperations;

@Service
public class CollegeService {
	@Autowired
	CollegeOperations cp;

	public List<College> getData() {
		return cp.findAll();
	}

	public void postData(College college) {
		cp.save(college);
	}

	public void deleteData(int sno) {
		cp.deleteById(sno);
	}

	public void getdata(int sno, College college) {
		
		
		

		
		College college1=cp.findById(sno).get();
		
		college1.setSname(college.getSname());
		college1.setSadd(college.getSadd());
		college1.setSage(college.getSage());
		college1.setSalary(college.getSalary());
		college1.setHiredate(college.getHiredate());
		college1.setSchool(college.getSchool());
		
		College college3=cp.save(college1);
		
		
		
	}

}
