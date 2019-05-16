package com.stackroute.pe3;


import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks x = new StudentMarks();

    @Test
    public void equa() {
        String z = x.isComp(20);
        assertEquals("true", z);
    }

    @Test
    public void Great() {
        String z = x.isComp(101);
        assertEquals("Input should not be greater than 100", z);
    }

    @Test
    public void Less() {
        String z = x.isComp(-5);
        assertEquals("Input should not be less than 0", z);
    }
}





