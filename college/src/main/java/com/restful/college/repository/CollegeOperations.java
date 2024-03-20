package com.restful.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.college.entity.College;

public interface CollegeOperations  extends JpaRepository<College, Integer>{

}
