package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareArraysTest
{

    CompareArrays compareArrays;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        compareArrays = new CompareArrays();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        compareArrays= null;
    }

    @Test
    public void setCompareArrays() {
        String[] array1 = {"10", "20", "30"};
        String[] array2 = {"10", "20", "30"};
        String result = "Both the arrays are equal";

        //This method checks actual output with expected output.
        assertEquals(result, compareArrays.compareArrays(array1, array2));

    }

    @Test
    public void checkDuplicateValues() {
        String[] array = {"26", "26", "96", "10"};
        String result = "duplicate values are found";

        //This method checks actual output with expected output.
        assertEquals(result, compareArrays.checkDuplicateValuesInArray(array));
    }

    @Test
    public void appendArrays() {
        String[] array1 = {"10", "20", "30"};
        String[] array2 = {"90", "40", "50"};
        String[] result = {"10", "20", "30", "90"};
        //This method checks actual output with expected output.
        assertArrayEquals(result, compareArrays.appendTwoArrays(array1, array2));
    }

    @Test
    public void prependArrays() {
        String[] array1 = {"10", "20", "30"};
        String[] array2 = {"40", "50", "60"};
        String[] result = {"50", "10", "20", "30"};

        //This method checks actual output with expected output.
        assertArrayEquals(result, compareArrays.prependTwoArrays(array1, array2));
    }

}