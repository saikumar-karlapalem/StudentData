package com.saiko.sample.student.data.service;


import static org.assertj.core.api.Assertions.assertThat;
import com.saiko.sample.student.data.entity.Student;
import com.saiko.sample.student.data.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceImplementationTest {

    @Autowired
    private StudentServiceImplementation studentService;



    @Test
    void addStudent() {
        Student student=new Student();
        student.setFull_name("mallik");
        student.setMobile_number(9139131313L);
        student.setCity("Gun");
        student.setBranch("CSE");

        studentService.addStudent(student);
    }

    @Test
    void retrieveAll() {
        ArrayList<Student> list= new ArrayList<>();
        list.add(new Student(252,"mallik","CSE",9139131313L,"Gun"));
        assertThat(list).usingRecursiveComparison().isEqualTo(studentService.retrieveAll());
    }

    @Test
    void retrieveById() {

        int id=12;
        String found=studentService.retrieveById(id);
        assertEquals("no such id "+"as "+id+ " found",found);

    }

    @Test
    void updateById() {
        String message="updated successfully";
        int id =302;
        assertEquals(message,studentService.updateById(id,new Student(302,"roshan","ECE",986754321L,"Banglore")));

    }

    @Test
    void deleteById() {
        String message="deleted successfully";
        int id=252;
        assertEquals(message,studentService.deleteById(id));


    }

    @Test
    void deleteAll() {
        String message="deleted successfully !";
        assertEquals(message,studentService.deleteAll());
    }
}