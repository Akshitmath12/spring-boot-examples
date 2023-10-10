// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Entity
public class Student_Student_6583406a35_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testStudentId() {
        Long id = 123L;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test
    public void testStudentName() {
        String name = "John Doe";
        student.setName(name);
        assertEquals(name, student.getName());
    }

    @Test
    public void testStudentPassportNumber() {
        String passportNumber = "AB123456";
        student.setPassportNumber(passportNumber);
        assertEquals(passportNumber, student.getPassportNumber());
    }
}
