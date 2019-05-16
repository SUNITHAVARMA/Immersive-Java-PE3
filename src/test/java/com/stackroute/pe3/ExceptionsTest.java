package com.stackroute.pe3;
import com.stackroute.pe3.Exceptions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class ExceptionsTest {
    private static Exceptions exception;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        exception = new Exceptions();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        exception = null;

    }
    @Test
    public void checkResult(){
        assertEquals("check null pointer exception","Null Pointer Exception",exception.checkException(null));
        assertEquals("check Negative Array Size Exception","Negative Array Size Exception",exception.checkException(new String[]{"-1","hi","hello"}));
        assertEquals("check Index Out Of Bounds Exception","Array Index Out Of Bounds Exception",exception.checkException(new String[]{"3","hi","hello","stackroute","ibm"}));


    }


}
