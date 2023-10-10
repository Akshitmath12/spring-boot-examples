// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import java.net.URI;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class StudentResource_createStudent_52b9f59693_Test {

    @InjectMocks
    StudentResource studentResource;

    @Mock
    StudentRepository studentRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student("John", "Doe", "john.doe@example.com");
        when(studentRepository.save(any(Student.class))).thenReturn(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(student.getId())
                .toUri();

        ResponseEntity<Object> response = studentResource.createStudent(student);
        assertEquals(201, response.getStatusCodeValue());
        assertEquals(location, response.getHeaders().getLocation());
    }

    @Test
    public void testCreateStudentFailure() {
        Student student = new Student("John", "Doe", "john.doe@example.com");
        when(studentRepository.save(any(Student.class))).thenReturn(null);

        ResponseEntity<Object> response = studentResource.createStudent(student);
        assertEquals(500, response.getStatusCodeValue());
    }
}
