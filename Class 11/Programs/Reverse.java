// A program to reverse a number using recursion

/*  
  
Algorithm:
Step 1: Start
Step 2: Define the class recur_reverse
Step 3: Define the function int find_reverse()
Step 4: Perform the operations required to find the reversed number
Step 5: Accept a number from the user in the main method
Step 6: Create an object of the class and invoke the method find_reverse() to display the reverse of the entered number
Step 7: Stop

 */
import java.util.*;
class Reverse
{
    static int find_reverse(int n) 
    {
        if (n == 0)
            return 0;

        int digits = (int) (Math.log(n)/Math.log(10)); // number of digits - 1

        return (n % 10) * (int) Math.pow(10, digits) + find_reverse(n / 10);//forming the reverse using recursive function
    }

    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");//accepting a number
        int num = sc.nextInt();

        System.out.println("Reversed number: " + find_reverse(num));//calling the reverse function
    }
      
}
    /*
    VARIABLE DESCRIPTION
        n - to store the number whose reverse is to be found
        digits - to store the number of digits in the number
        num - to accept the original number from user
    */
    