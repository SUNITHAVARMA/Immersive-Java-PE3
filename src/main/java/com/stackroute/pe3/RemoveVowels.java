package com.stackroute.pe3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveVowels {

    //This method returns the removed vowels string
    public  String[] removeVowelsInString(String[] querystring) {
    String[] words = new String[querystring.length];
    for (int i = 0; i <querystring.length; i++) {
        if (querystring[i] != null) {
            //This statements gives remove all vowels in the string.
            words[i] = querystring[i].replaceAll("[aeiou]", "");
            if(querystring[i].matches(".*\\d.*")){
                return "digits are not allowed".split(",");
            }
        }
        if(querystring[i].length()==0){
            return "empty strings are not allowed".split(",");
        }

    }
    return words;
    }
}
