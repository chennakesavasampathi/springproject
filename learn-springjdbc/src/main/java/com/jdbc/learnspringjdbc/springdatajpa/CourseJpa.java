package com.jdbc.learnspringjdbc.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.learnspringjdbc.repo.Course;

public interface CourseJpa  extends JpaRepository<Course, Integer>{

}
