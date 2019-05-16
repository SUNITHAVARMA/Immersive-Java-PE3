package com.stackroute.pe3;


import java.util.*;


public class StudentMarks {

    public String isComp(int a) {
        String res = "";
        if ((a >= 0) && (a <= 100)) {
            res = "true";

        }
        if (a > 100) {
            res = "Input should not be greater than 100";
        }
        if (a < 0) {
            res = "Input should not be less than 0";
        }

        return res;
    }
}