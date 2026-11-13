//Program to generate Fibonacci series
/*
 Algorithm:
 Step 1: Start
 Step 2: Declare the class Fibonacci
 Step 3: Define the function input() to accept no. of terms
 Step 4: If user entered term is negative,then return zero
 Step 5: If user entered term is 2, then return 1
 Step 6: Else, return the sum of previous two terms using recursive function fib()
 Step 7: Define the function generate_fib() to display the Fibonacci series
 Step 8: Create an object of the class and use it to invoke the methods input() and generate_fib()
 Step 9: Stop
 */

import java.util.*;
class Fibonacci
{
    int a,b,c,i,limit;
    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.print("Enter number of terms: ");
        limit=sc.nextInt();
    }
    
    int fib(int n)
    {
        if(n<=1)
           return 0;
        else if(n==2) 
           return 1;
        else
              return fib(n-1)+fib(n-2); //recursive call 
    }
    void genrate_fib()
    {
        System.out.print("Fibonacci Series: ");
        for(i=1;i<=limit;i++)
        {
            c=fib(i);
            System.out.print(c+" ");
        }
    }

    public static void main()
    {
        Fibonacci obj=new Fibonacci();
        obj.input();
        obj.genrate_fib();
    }
}

/*
    VARIABLE DESCRIPTION
    a,b,c - to store the first two terms and the next term of the series
    i - loop variable
    limit - to store the number of terms entered by user
 */