package com.saiko.sample.student.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.saiko.sample.student.data.entity.Student;
import com.saiko.sample.student.data.service.StudentServiceImplementation;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/saiko/")
public class StudentController {
	
	@Autowired
	private StudentServiceImplementation studentService;

	@PostMapping("/add/student")
	public String addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
		return "Student Added Successfully .  \n"+student.toString();
		
	}

	@GetMapping("/students")
	public List<Student> retrieveAll()
	{
		return studentService.retrieveAll();

    }

	@GetMapping("/student/{id}")
	public String retrieveById(@PathVariable("id") int id)
	{

		return studentService.retrieveById(id);
	}

	@PutMapping("/updateById/{id}")
	public String updateById(@PathVariable("id") int id, @RequestBody Student studentt)
	{
		return studentService.updateById(id,studentt);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable("id") int id )
	{
		return studentService.deleteById(id);

	}

	@DeleteMapping("/delete/all")
	public String deleteAll()
	{
       return studentService.deleteAll();
    }

}
