// Test generated by RoostGPT for test RestBasicService using AI Type Open AI and AI Model gpt-4

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Student_setId_04a8e16b7c_Test {

    @Mock
    private Student student;
    
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        student = new Student();
    }

    @Test
    public void testSetId_ValidId() {
        Long validId = 123456L;
        student.setId(validId);
        Assertions.assertEquals(validId, student.getId(), "The ID should be set correctly");
    }

    @Test
    public void testSetId_NullId() {
        Long nullId = null;
        student.setId(nullId);
        Assertions.assertNull(student.getId(), "The ID should be null");
    }
}
