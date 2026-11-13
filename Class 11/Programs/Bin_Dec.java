//Program to convert binary to decimal

/*
Algorithm:
Step 1: Start
Step 2: Declare the class bin_dec
Step 3: Define the function converter()
Step 4: While defining the function extract each digit of the number and store it for further calculation
Step 5: Apply the necessary conditions to calculate the binary equivalent of the number and store it
Step 6: Define a display() function to accept the user input, call the recursive function and display the result
Step 7: Create an object of the class and invoke the display() function to call function
Step 8: Stop
*/

import java.util.*;
class Bin_Dec
{ 
    int d,b=0,i=0,n;
    Scanner sc=new Scanner(System.in);
    int converter(int n)
    {
        if(n>0)
        {
            d=n%10; //extracting last digit
            b=b+(d*(int)Math.pow(2,i)); //calculating decimal equivalent
            i++;
            converter(n/10); //recursive call
        }
        return b;
    }
    
    void display()
    {
        System.out.print("Enter binary number: ");
        n=sc.nextInt(); 
        int c=converter(n); //calling the function
        System.out.println("Decimal equivalent: "+c);
    }

    public static void main(String args[])
    {
        Bin_Dec obj=new Bin_Dec(); //creating object
        obj.display(); //calling display function
    }
}
/*
 VARIABLE DESCRIPTION
    d - to store the last digit of binary number
    b - to store the decimal equivalent of binary number
    i - to store the power of 2
    n - to accept binary number from user
*/