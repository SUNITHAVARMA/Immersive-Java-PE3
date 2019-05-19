package com.stackroute.pe3;

public class CompareArrays {

    //This method compares the two arrays.
    public String compareArrays(String[] array1,String[] array2)
    {
        String result="";

        //this condition compares the lengths of two arrays.
        if(array1.length==array1.length)
        {
            for(int i=0;i<array1.length;i++)
            {
                if(array1[i]==array1[i]){
                    result="Both the arrays are equal";
                }
                else
                {
                    result="Arrays are not equal";
                    break;
                }
            }

        }
        else{
                result="Arrays are not equal";
            }

        return result;
    }

    //This method eleminates duplicate values in the array and returns array.
    public String checkDuplicateValuesInArray(String[] array)
    {
        String result="";
        for(int i=0;i<array.length;i++)
        {
            for(int j=1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    result="duplicate values are found";
                    break;

                }
                else{

                    result="no duplicate values found";
                }
            }
        }

        return result;
    }

    //This method returns append array.
    public String[] appendTwoArrays(String[] array1,String[] array2)
    {
        String[] result=new String[array1.length+1];
        for(int i=0;i<array1.length;i++)
        {
            result[i]=array1[i];

        }
        result[result.length-1]=array2[0];

        return result;
    }

    //This method prepend the arrays
    public String[] prependTwoArrays(String[] array1,String[] array2)
    {
        String[] result=new String[array1.length+1];
        String temp=array2[array2.length/2];
        for(int i=0,j=1;i<array1.length&&j<result.length;i++,j++)
        {

            result[j]=array1[i];

        }

        result[0]=temp;
        return result;
    }
}