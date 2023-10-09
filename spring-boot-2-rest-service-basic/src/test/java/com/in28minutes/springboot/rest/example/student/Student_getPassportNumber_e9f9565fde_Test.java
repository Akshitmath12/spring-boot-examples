// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getPassportNumber_e9f9565fde_Test {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPassportNumber() {
        String expectedPassportNumber = "ABC123";
        student.setPassportNumber(expectedPassportNumber);
        String actualPassportNumber = student.getPassportNumber();
        assertEquals(expectedPassportNumber, actualPassportNumber, "The passport number returned by the getPassportNumber method is not as expected");
    }

    @Test
    public void testGetPassportNumberWhenPassportNumberIsNull() {
        student.setPassportNumber(null);
        String actualPassportNumber = student.getPassportNumber();
        assertEquals(null, actualPassportNumber, "The passport number returned by the getPassportNumber method is not as expected when passport number is null");
    }
}
