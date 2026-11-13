//Program to convert decimal to binary

/*
 Algorithm:
Step 1: Start
Step 2: Define the class bin_dec
Step 3: Define a parameterized constructor to initialize the default values
Step 4: Define the function convert() to apply necessary conditions to extract each digit from the number and convert it to binary equivalent
Step 5: Define a function display() to accept any input from the user and display the binary equivalent number
Step 6: Create an object of the class and call the method dislay() to call the function
Step 7: Stop

 */
import java.util.*;
public class Dec_Bin 
{
    int num; long bin;
    Scanner sc=new Scanner(System.in);

    public Dec_Bin(int n)
    {
        num=n;
        bin=0L;
    }

    public long convert()
    {
        if(num==0)
         return 0;
        else if(num==1)
         return 1L; 
        else
        {
            int rem=num%2;
            num/=2; 
            return (convert()*10L+rem);
        }
    }
    
    public void display()
    {
        System.out.println("Decimal number: "+num);
        bin=convert();
        System.out.println("Binary equivalent: "+bin);
    }
    
    public static void main()
    {
        System.out.println("Positive integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dec_Bin obj=new Dec_Bin(n);
        obj.display();
    } 
        
}    

/*
 VARIABLE DESCRIPTION
    num - to store the decimal number entered by user
    bin - to store the binary equivalent of the decimal number
 */