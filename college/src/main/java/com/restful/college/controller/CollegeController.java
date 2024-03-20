package com.restful.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restful.college.entity.College;
import com.restful.college.service.CollegeService;

@RestController
@RequestMapping("/api")
public class CollegeController {
	@Autowired
	CollegeService cs;
	
	
	
@RequestMapping(value="/say", method=RequestMethod.GET)
//@ResponseBody
	public String sayHello() {
		
		
		return"Hai chennakesava "
				+ "How are you";
	}


// To get the data from college table 
@RequestMapping(value="/get" , method=RequestMethod.GET)
public List<College> getDetails(){
	
	return cs.getData();
	
}

// post the data into the table
@RequestMapping(value="post" , method=RequestMethod.POST)
public String postDetails(@RequestBody College college ) {
	
	
	cs.postData(college);
	
	return "save data successfully";
	
}

// delete the data based on id 
@RequestMapping(value="/delete", method=RequestMethod.DELETE)
public String deleteData(@RequestParam int sno) {
	
	
	cs.deleteData(sno);
	
	
	return"delete data successfully";
}
@PutMapping("/update")
public String updateData(@RequestParam int sno,  @RequestBody College college) {
	
cs.getdata(sno,college);
	
	return "upadate data successfully";
}













	
	
}
