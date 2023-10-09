// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentResource_retrieveAllStudents_874a3b8f8a_Test {

    @InjectMocks
    StudentResource studentResource;

    @Mock
    StudentRepository studentRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRetrieveAllStudents() {
        Student student1 = new Student("John", "Math");
        Student student2 = new Student("Jane", "Science");
        Student student3 = new Student("Bob", "History");
        List<Student> students = Arrays.asList(student1, student2, student3);

        when(studentRepository.findAll()).thenReturn(students);

        List<Student> result = studentResource.retrieveAllStudents();
        assertEquals(3, result.size());
    }

    @Test
    public void testRetrieveAllStudents_empty() {
        List<Student> students = Arrays.asList();

        when(studentRepository.findAll()).thenReturn(students);

        List<Student> result = studentResource.retrieveAllStudents();
        assertEquals(0, result.size());
    }
}
