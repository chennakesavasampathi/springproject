package com.jdbc.learnspringjdbc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.learnspringjdbc.repo.Course;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {

}
