package com.stackroute.pe3;

public class Exceptions {
public String checkException(String[] array) {

 try{
     if(array.length==0)
         throw new NullPointerException();
     for(int i=0;i<array.length;i++){
         int size=array[i].length();
         if(Integer.parseInt(array[i])<0){
             throw new NegativeArraySizeException();
         }
         if(array.length!=size){
             throw new ArrayIndexOutOfBoundsException();

         }
     }

 }
 catch (NullPointerException e){
     return "Null Pointer Exception";
 }
 catch (NegativeArraySizeException e1){
     return "Negative Array Size Exception";
 }
 catch (ArrayIndexOutOfBoundsException e2){
     return "Array Index Out Of Bounds Exception";
 }
 return "checked exceptions";
}
}
