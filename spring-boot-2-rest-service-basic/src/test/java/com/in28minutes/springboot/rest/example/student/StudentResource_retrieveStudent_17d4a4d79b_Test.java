// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.springboot.rest.example.student.Student;
import com.in28minutes.springboot.rest.example.student.StudentNotFoundException;
import com.in28minutes.springboot.rest.example.student.StudentRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class StudentResource_retrieveStudent_17d4a4d79b_Test {
    
    @Mock
    private StudentRepository studentRepository;
    
    @InjectMocks
    private StudentResource studentResource;
    
    private Student student;
    
    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setDescription("Test Description");
    }
    
    @Test
    public void testRetrieveStudent_Success() {
        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
        
        Student retrievedStudent = studentResource.retrieveStudent(1L);
        
        assertEquals(student, retrievedStudent);
    }
    
    @Test
    public void testRetrieveStudent_StudentNotFound() {
        when(studentRepository.findById(1L)).thenReturn(Optional.empty());
        
        assertThrows(StudentNotFoundException.class, () -> {
            studentResource.retrieveStudent(1L);
        });
    }
}
