package com.saiko.sample.student.data.repository;

import com.saiko.sample.student.data.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    private TestEntityManager testEntityManager;

    @BeforeEach
    void setUp() {

        Student student_1=new Student(302,"mouni roy","CSE",987656748L,"Gujarat");
        studentRepository.save(student_1);
    }

    @Test
    public void testById()
    {
        int id=302;
        Optional<Student> s1= Optional.of(new Student(302, "mouni roy", "CSE", 987656748L, "Gujarat"));
        assertThat(s1).usingRecursiveComparison().isEqualTo(studentRepository.findById(id));


    }
}