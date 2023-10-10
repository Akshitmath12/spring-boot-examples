// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_setPassportNumber_27b9a7834a_Test {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetPassportNumber_ValidPassport() {
        String validPassportNumber = "123456789";
        student.setPassportNumber(validPassportNumber);
        assertEquals(validPassportNumber, student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumber_EmptyPassport() {
        String emptyPassportNumber = "";
        student.setPassportNumber(emptyPassportNumber);
        assertEquals(emptyPassportNumber, student.getPassportNumber());
    }
}
