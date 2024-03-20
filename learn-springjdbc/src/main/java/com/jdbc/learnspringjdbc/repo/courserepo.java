package com.jdbc.learnspringjdbc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class courserepo {
	@Autowired
	JdbcTemplate repo;
	
	String insert1="""  
			insert into course values(?,?,?)
			
			
			""";
	
	String delete1="""  
delete from course where id=?;			
			 
			
			""";
	String select1="""   
			
			select * from course where id=?
			""";
	
	
	public void insert(Course course) {
	
		repo.update(insert1,course.getId(),course.getName(),course.getAdd());
	}
	
	public void deleteById(int i) {
		repo.update(delete1,i);
		
	}
	
	public Course get(int id){
		
		return repo.queryForObject(select1, new BeanPropertyRowMapper<>(Course.class),id);
		
	}
	
	

}
