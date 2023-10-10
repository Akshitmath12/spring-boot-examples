// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Student_setPassportNumber_27b9a7834a_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        student = new Student();
    }

    @Test
    public void testSetPassportNumber_validPassportNumber() {
        String validPassportNumber = "123456789";
        student.setPassportNumber(validPassportNumber);
        Assertions.assertEquals(validPassportNumber, student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumber_nullPassportNumber() {
        String nullPassportNumber = null;
        student.setPassportNumber(nullPassportNumber);
        Assertions.assertNull(student.getPassportNumber());
    }
}
