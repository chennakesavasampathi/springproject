package com.jdbc.learnspringjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbc.learnspringjdbc.jpa.CourseJpa;
import com.jdbc.learnspringjdbc.repo.Course;
import com.jdbc.learnspringjdbc.repo.CourseJPA;

@SpringBootApplication
public class LearnSpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringjdbcApplication.class, args);
//		courserepo course=context.getBean(courserepo.class);
		
		CourseJpa courseone= context.getBean(CourseJpa.class);		
		courseone.insertOne(new Course('1',"chenna","krp"));
		courseone.insertOne(new Course('2',"chenna","krp"));
		courseone.insertOne(new Course('3',"chenna","krp"));
		courseone.insertOne(new Course('4',"chenna","krp"));
		courseone.deleteById(49);
		System.out.println(courseone.findByid(50));
		
		
		
//		course.insert(new Course(1,"chenna","krp"));
//		course.insert(new Course(2,"chenna","krp"));
//		course.insert(new Course(3,"chenna","krp"));
//		course.insert(new Course(4,"chenna","krp"));
//		
//		course.deleteById(4);
//		
//		System.out.println(course.get(1));
//		System.out.println(course.get(2));
//		
	}

}
