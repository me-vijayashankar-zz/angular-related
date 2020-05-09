package com.infosys.servicedemo.servicedemo.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.servicedemo.servicedemo.Models.StudentModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/stu")
@CrossOrigin("*")
public class Student {

	@GetMapping("/one")
	@CrossOrigin("*")
	public ResponseEntity<?> getOneStudent() {
		return new ResponseEntity<StudentModel>(new StudentModel("Priyanka", 1234567890, "priyanka@abc.com", ".net", "FullTime"),new HttpHeaders(),HttpStatus.OK);
		// new StudentModel("Priyanka", 1234567890, "priyanka@abc.com", ".net", "FullTime");
	}
	@CrossOrigin("*")
	@PostMapping(value = "/save")
	public ResponseEntity<?> saveStudentModel(@RequestBody StudentModel stu) {
		System.out.println(stu.toString());
		return new ResponseEntity<StudentModel>(stu,new HttpHeaders(),HttpStatus.OK);
		// return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
