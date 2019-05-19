package com.stackroute.pe3;

public class CheckPrimeEvenOdd
{
    /*This method returns the prime numbers and checks every number even or odd*/
    public String[] checkNumberEvenOrOdd(int input[])
    {
        String[] result = new String[input.length];
        for(int i=0; i< input.length; i++)
        {
            if(input[i]%2 == 0)
            {
                result[i] ="even";
            }
            else
            {
                result[i]="odd";
            }
        }
        return result;
    }

    /*This method returns the array elements in reverse order*/
    public int[] reverseArrayElements(int input[])

    {   int b[]=new int[input.length];
        int i;
        int j=0;
        for (i=(input.length)-1;i>=0;i--)
        {
            b[j]+=input[i];
            j++;
        }
        System.out.println(b);
        return b;
    }

    /*This method returns the removed prime numbers array*/
    public int [] removePrimeNumbersInArray(int input[]) {

        int i = 0;
        int j = 0;
        int k = 0;
        int countCompositeNumber = 0;
        int countPrimeNumber = 0;
        for(i = 0; i < input.length; i++){
            if(isPrime(input[i]))
                countPrimeNumber++;
            else
                countCompositeNumber++;
        }
        int prim[] = new int[countPrimeNumber];
        int com[] = new int[countCompositeNumber];
        for(i = 0; i < input.length; i++){
            if(isPrime(input[i]))
                prim[j++] = input[i];
            else


                com[k++] = input[i];
        }
        System.out.println("Prime Numbers:");
        for(i = 0; i < prim.length; i++)
            System.out.print(prim[i] + "\t");
        System.out.println("\nComposite Numbers:");
        // for(i = 0; i < com.length; i++)
        int result[] = new int[com.length];
        int m=0;
        System.out.println(com.length);
        for(i = 0; i < com.length; i++)
        {
            System.out.print(com[i] + "\t");
            result[m]+=com[i];
            m++;
        }
        return result;
    }

    /*This method returns the number is prime number or not*/
    public static boolean isPrime(int n)
    {
        int f = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                f++;
        if(f == 2)
            return true;
        return false;
    }
}