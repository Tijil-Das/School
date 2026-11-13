//Program to compute the factorial of a number

/*
 Algorithm:
 Step 1: Start
 Step 2: Declare the class Factorial
 Step 3: Declare the function generate_factorial(int n) and generate factorial recursively
 Step 4: Define the main method and take input from user
 Step 5: Create an object of the class and use it to invoke the method generate_factorial() and display the result
 Step 6: Stop 
 */

 import java.util.*;
 class Factorial
 {
    long generate_factorial(int n)
    {
        if(n==0)
            return 1L;
        else
            return n*generate_factorial(n-1);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: "); 
        int num=sc.nextInt();
        Factorial obj=new Factorial();
        long factorial=obj.generate_factorial(num);
        System.out.println("Factorial of "+num+" is: "+factorial);
    }

 }

 /*
  VARIABLE DESCRIPTION
    n - to store the number whose factorial is to be calculated
    num - to accept user input
    factorial - to store the factorial of the number
 */   