package com.saiko.sample.student.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiko.sample.student.data.entity.Student;
import com.saiko.sample.student.data.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService  {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public
	List<Student> retrieveAll() {
		return studentRepository.findAll();

	}

	@Override
	public String retrieveById(int id)
	{
		Optional<Student> student=studentRepository.findById(id);
		if(student.isPresent())
		{
			return student.toString();
		}

		else {
			return "no such id as "+id+" found";
		}
	}

	public String updateById(int id, Student studentt) {
		Optional<Student> student=studentRepository.findById(id);
		if (student.isPresent())
		{
			Student student1=new Student();
			student1.setId(studentt.getId());
			student1.setBranch(studentt.getBranch());
			student1.setCity(studentt.getCity());
			student1.setMobile_number(studentt.getMobile_number());
			student1.setFull_name(studentt.getFull_name());
			studentRepository.save(student1);
			return "updated successfully";
		}
		else{
			return "please check id ";
		}

	}

	@Override
	public String deleteById(int id) {
		Optional<Student> student=studentRepository.findById(id);
		if(student.isPresent())
		{
			studentRepository.deleteById(id);
			return "deleted successfully";
		}
		else {
			return "please check id ";
		}
	}

	@Override
	public String deleteAll() {
		studentRepository.deleteAll();
		return "deleted successfully !";
	}


}
