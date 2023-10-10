// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class StudentResource_deleteStudent_0348006656_Test {

    @MockBean
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentResource studentResource;

    @Test
    public void testDeleteStudentSuccess() {
        long id = 1L;
        doNothing().when(studentRepository).deleteById(id);
        studentResource.deleteStudent(id);
        verify(studentRepository, times(1)).deleteById(id);
    }

    @Test
    public void testDeleteStudentFailure() {
        long id = 2L;
        doNothing().when(studentRepository).deleteById(id);
        studentResource.deleteStudent(id + 1);
        verify(studentRepository, times(0)).deleteById(id);
    }
}
