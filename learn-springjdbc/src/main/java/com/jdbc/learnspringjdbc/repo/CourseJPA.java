package com.jdbc.learnspringjdbc.repo;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPA {
@PersistenceContext
	EntityManager entityManager;
	
public void insertone(Course course) {
	
	entityManager.merge(course);
	
	
	
}

	

	
}
