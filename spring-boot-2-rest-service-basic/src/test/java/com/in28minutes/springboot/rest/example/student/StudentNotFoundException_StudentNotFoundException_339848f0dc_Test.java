// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentNotFoundException_StudentNotFoundException_339848f0dc_Test {

    @Test
    public void testStudentNotFoundException() {
        String exceptionMessage = "Student not found";
        StudentNotFoundException exception = new StudentNotFoundException(exceptionMessage);
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    public void testStudentNotFoundExceptionEmptyMessage() {
        String exceptionMessage = "";
        StudentNotFoundException exception = new StudentNotFoundException(exceptionMessage);
        assertEquals(exceptionMessage, exception.getMessage());
    }
}
