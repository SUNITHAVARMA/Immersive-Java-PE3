package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;


public class CheckPrimeEvenOddTest
{
    CheckPrimeEvenOdd p;

    @Before
    public void setup()
    {
        //arrenge
        p = new CheckPrimeEvenOdd();
    }

    @After
    public void tearDown()
    {
        //arrenge
        p= null;
    }

    @Test
    public void evenOddTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};
        String[] result = p.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        assertArrayEquals(expected, result);

    }
    @Test
    public void reversearrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8,4};
        int [] result = p.reversearray(arr);
        int [] expected = {4,8,7,3,4};
        assertArrayEquals(expected, result);

    }
    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 8};
        int[] result = p.removePrime(arr);
        int[] expected = {12,8};
        assertArrayEquals(result, expected);

    }
}