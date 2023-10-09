// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentResource_deleteStudent_0348006656_Test {

    @InjectMocks
    StudentResource studentResource;

    @Mock
    StudentRepository studentRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeleteStudent_Success() {
        long id = 1L; // TODO: Change the id value

        studentResource.deleteStudent(id);

        verify(studentRepository, times(1)).deleteById(id);
    }

    @Test
    public void testDeleteStudent_Failure() {
        long id = 999L; // TODO: Change the id value

        studentResource.deleteStudent(id);

        verify(studentRepository, times(1)).deleteById(id);
    }
}
