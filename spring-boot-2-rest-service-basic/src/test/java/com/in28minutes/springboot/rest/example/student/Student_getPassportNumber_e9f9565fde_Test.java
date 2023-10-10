// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;

public class Student_getPassportNumber_e9f9565fde_Test {
    
    @InjectMocks
    private Student student;

    @Mock
    private String passportNumber;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPassportNumber() {
        String expectedValue = "AB123456";
        student.setPassportNumber(expectedValue);
        String actualValue = student.getPassportNumber();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetPassportNumber_Null() {
        String expectedValue = null;
        student.setPassportNumber(expectedValue);
        String actualValue = student.getPassportNumber();
        assertEquals(expectedValue, actualValue);
    }
}
