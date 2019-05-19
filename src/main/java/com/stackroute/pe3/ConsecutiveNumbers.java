package com.stackroute.pe3;

import java.util.Scanner;
import java.lang.String;


public class ConsecutiveNumbers {

    //This method returns the input either consecutive numbers or non consecutive numbers.
    public String getConsecutiveNumbers(int[] queryString){
        String s1="consecutive";
        String s2="non consecutive";
        boolean result1=true;

        //This method returns elements are either consecutive or non consecutive numbers.
        result1=checkConsecutive(queryString);
        if(result1==true) {
            return s1;
        }
        else return s2;
    }
    public static boolean checkConsecutive(int[] queryString){

        boolean result=true;
        int size=queryString.length;
        for(int i=0;i<size-1;i++){

            //This statement checks the difference between two numbers.
            if(((queryString[i+1]-queryString[i])!=1) &&((queryString[i]-queryString[i+1])!=1)){
                return false;
            }
        }
        return true;

    }


}
