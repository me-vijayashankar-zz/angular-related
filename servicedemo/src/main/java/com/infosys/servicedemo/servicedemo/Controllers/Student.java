package com.infosys.servicedemo.servicedemo.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.servicedemo.servicedemo.Models.StudentModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/stu")
public class Student {

	@GetMapping("/one")
	@CrossOrigin("*")
	public StudentModel getOneStudent() {
		return new StudentModel("Priyanka", 1234567890, "priyanka@abc.com", ".net", "FullTime");
	}
	@CrossOrigin("*")
	@PostMapping(value = "/save")
	public StudentModel saveStudentModel(@RequestBody StudentModel stu) {
		System.out.println(stu.toString());
		return stu;
	}

}
