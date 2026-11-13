//Check Whether a Number is Prime or Not Using Recursive Functions

/*
Algorithm:
Step 1: Start
Step 2: Define the class recur_prime
Step 3: Define the function int check_prime(int n) 
Step 4: Apply the necessary conditions to check whether a number is prime or not
Step 5: Accept a number from the user
Step 6: Create an object of the class and invoke the method check_prime(); to disply appropriate mesaage wheter the number is prime or not
Step 7: Stop
*/

import java.util.*;
class Prime
{
    
    boolean Check_Prime(int n, int i, int c)
    {
        if(i<=n)
        {
           if(n%i==0)
             c++;
           i++;
           return Check_Prime(n, i, c);
        }
        if(c==2)
          return true;
        else
          return false;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        Prime obj=new Prime();

        if(obj.Check_Prime(num,1,0))
          System.out.println(num+" is a Prime Number");
        else
          System.out.println(num+" is not a Prime Number");
        
    } 
}
/*
 * VARIABLE DESCRIPTION
    n - the number to be checked for primality
    num - the number input by the user
    i - loop variable used to check divisibility from 1 to n
    c - to count the number of divisors of the number
 */
