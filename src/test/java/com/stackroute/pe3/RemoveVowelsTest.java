package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe3.RemoveVowels;
public class RemoveVowelsTest {
    private static RemoveVowels removeVowels;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        removeVowels = new RemoveVowels();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        removeVowels = null;

    }
    @Test
    public void testConsecutiveNumbers() {
        assertEquals(
                "check remove vowels from array of string",
               new String[]{"Ind","jpn","UntdStts"}, removeVowels.removeVowelsInString(new String[]{"India","japan","UnitedStates"}));
        assertEquals(
                " check if digits in the string",
              new String[]{"digits are not allowed"},removeVowels.removeVowelsInString(new String[]{"India","Ja123","japan"}));
         assertEquals("check if empty strings in the array or not",new String[]{"empty strings are not allowed"},removeVowels.removeVowelsInString(new String[]{"India","","japan"}));
    }
}
