package com.saiko.sample.student.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saiko.sample.student.data.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
