package com.saiko.sample.student.data.controller;

import com.saiko.sample.student.data.entity.Student;

import com.saiko.sample.student.data.service.StudentServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;


import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentServiceImplementation studentService;





    @BeforeEach
    void setUp() {
    }

    @Test
    void addStudent() throws Exception {

//        Student s1=new Student(123,"moj","ECE",9878765L,"Vijayawada");

        mockMvc.perform(post("/saiko/add/student")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"full_name\":\"John Doe\",\"branch\":\"Computer Science\",\"mobile_number\":\"1234567890\",\"city\":\"Springfield\"}"))
                .andExpect(status().isOk());
//                .andExpect((ResultMatcher) jsonPath("$.id").value(1))
//                .andExpect((ResultMatcher) jsonPath("$.full_name").value("John Doe"))
//                .andExpect((ResultMatcher) jsonPath("$.branch").value("Computer Science"))
//                .andExpect((ResultMatcher) jsonPath("$.mobile_number").value("1234567890"))
//                .andExpect((ResultMatcher) jsonPath("$.city").value("Springfield"));
    }


}