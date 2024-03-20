package com.jdbc.learnspringjdbc.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdbc.learnspringjdbc.repo.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpa {
	@Autowired
	CourseJpaRepository cs;
	
@PersistenceContext
	EntityManager entityManager;
	public void insertOne(Course course) {
		entityManager.merge(course);
		
	}
	public void deleteById(int id) {
     entityManager.remove(entityManager.find(Course.class, id));             ;	
	}
	
	public Course findByid(int id) {
		
		return entityManager.find(Course.class, id);
		
		
		
	}
	
	
	

}
