package com.saiko.sample.student.data.service;

import com.saiko.sample.student.data.entity.Student;

import java.util.List;


public interface StudentService {

	void addStudent(Student student);

    List<Student> retrieveAll();

    String retrieveById(int id);

    String updateById(int id, Student studentt);

    String deleteById(int id);

    String deleteAll();
}
