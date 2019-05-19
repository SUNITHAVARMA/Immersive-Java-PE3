package com.stackroute.pe3;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    private static StudentMarks studentMarks;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentMarks = new StudentMarks();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentMarks = null;

    }
    @Test
    public void compareEqualMarks(){
        String input= studentMarks.compareStudentMarks(20);
        assertEquals("true", input);
    }

    @Test
    public void compareGreaterMarks() {
        String input = studentMarks.compareStudentMarks(101);
        assertEquals("Input should not be greater than 100", input);
    }

    @Test
    public void compareLessMarks() {
        String input = studentMarks.compareStudentMarks(-5);
        assertEquals("Input should not be less than 0", input);
    }
}





