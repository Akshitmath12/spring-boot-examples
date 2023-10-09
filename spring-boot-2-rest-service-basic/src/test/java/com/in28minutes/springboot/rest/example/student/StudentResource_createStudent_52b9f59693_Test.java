// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentResource_createStudent_52b9f59693_Test {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent_success() throws Exception {
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setPassportNumber("E1234567");

        when(studentRepository.save(any(Student.class))).thenReturn(student);

        mockMvc.perform(post("/students")
                .content("{\"name\":\"John Doe\", \"passportNumber\":\"E1234567\"}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    public void testCreateStudent_failure() throws Exception {
        when(studentRepository.save(any(Student.class))).thenReturn(null);

        mockMvc.perform(post("/students")
                .content("{\"name\":\"John Doe\", \"passportNumber\":\"E1234567\"}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isInternalServerError());
    }
}
