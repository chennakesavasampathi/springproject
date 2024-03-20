package com.jdbc.learnspringjdbc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.learnspringjdbc.repo.Course;

public interface CourseJpaRepo extends JpaRepository<Course, Integer>{
	

}
