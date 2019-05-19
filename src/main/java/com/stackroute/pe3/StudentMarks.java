package com.stackroute.pe3;


import java.util.*;


public class StudentMarks {
    //This method gives statements based on conditions.
    public String compareStudentMarks(int input) {
        String result = "";
        if ((input >= 0) && (input <= 100)) {
            result = "true";

        }
        if (input > 100) {
            result = "Input should not be greater than 100";
        }
        if (input < 0) {
            result = "Input should not be less than 0";
        }

        return result;
    }
}