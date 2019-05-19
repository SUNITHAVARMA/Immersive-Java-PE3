package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;


public class CheckPrimeEvenOddTest
{
    CheckPrimeEvenOdd primeNumber;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        primeNumber = new CheckPrimeEvenOdd();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        primeNumber= null;
    }

    @Test
    public void numberIsEvenOrOddTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};

        //This statement returns numbers either even or odd.
        String[] result = primeNumber.checkNumberEvenOrOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};

        //This method checks actual result with expected output.
        assertArrayEquals(expected, result);

    }
    @Test
    public void reversearrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8,4};

        //This statement returns the reversed array elements.
        int [] result = primeNumber.reverseArrayElements(arr);
        int [] expected = {4,8,7,3,4};

        //This method check actual output with expected output.
        assertArrayEquals(expected, result);

    }
    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 8};

        //This statement returns array contains removed prime number.
        int[] result = primeNumber.removePrimeNumbersInArray(arr);
        int[] expected = {12,8};

        //This method checks the actual output with expected output.
        assertArrayEquals(result, expected);

    }
}