// Program to check if a given number is a palindrome
/*
 
Algorithm:
Step 1: Start
Step 2: Define the class Palindrome
Step 3: Define the function int find_reverse()
Step 4: Perform the operations required to find the reversed number in find_reverse()
Step 5: Define the function isPalindrome() to check if the number is a palindrome
Step 6: Accept a number from the user in the main method
Step 7: Move forward to calling the methods and displaying output
Step 8: Stop

 */

 import java.util.*;
 class Palindrome
 {
    int find_reverse(int n) 
    {
        if (n == 0)
            return 0;

        int digits = (int) (Math.log(n)/Math.log(10)); // number of digits - 1

        return (n % 10) * (int) Math.pow(10, digits) + find_reverse(n / 10);//forming the reverse using recursive function
    }


    void isPalindrome(int original, int reversed)
    {
        if(original == reversed)
          System.out.println(original + " is a Palindrome number.");
        else
          System.out.println(original + " is not a Palindrome number.");
    }

    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");//accepting a number
        int original = sc.nextInt();

        Palindrome obj= new Palindrome();
        int reversed= obj.find_reverse(original);//calling the reverse function
        obj.isPalindrome(original, reversed);
     }
 }
 /*
   VARIABLE DESCRIPTION
    n - to store the number whose reverse is to be found
    digits - to store the number of digits in the number
    original - to store the original number entered by user
    reversed - to store the reversed number
  */