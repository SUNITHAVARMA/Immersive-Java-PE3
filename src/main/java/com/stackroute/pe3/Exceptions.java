package com.stackroute.pe3;

public class Exceptions
{

    //This method returns the exception types based on conditions
    public String checkException(String[] array)
    {

    try{

     //This statement checks the NullPointer Exception condition.
     if(array.length==0)
         throw new NullPointerException();
     for(int i=0;i<array.length;i++){
         int size=array[i].length();

         //This statement checks the Negative array size exception condition.
         if(Integer.parseInt(array[i])<0){
             throw new NegativeArraySizeException();
         }

         //This statement checks the Array index out of bounds exception.
         if(array.length!=size){
             throw new ArrayIndexOutOfBoundsException();

         }
     }

    }
    catch (NullPointerException e)
    {
     return "Null Pointer Exception";
    }
    catch (NegativeArraySizeException e1)
    {
     return "Negative Array Size Exception";
    }
    catch (ArrayIndexOutOfBoundsException e2)
    {
     return "Array Index Out Of Bounds Exception";
    }
    return "checked exceptions";
    }
}
