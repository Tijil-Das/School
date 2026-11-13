/*Write a Java program to process a matrix of order m x n containing octal digits, where m is the number of rows and n is the number of columns (m > 0, 2 < n < 6).

Class name: Octal_Matrix

Data member: a[][]

Member functions:
1. input(): To accept the dimensions within specified constraints and populate the matrix with valid octal digits, ensuring the matrix is not entirely composed of zeros. 		                  
2. display(): To output the original matrix in a tabular format.				       
3. convert(): To determine and display the decimal equivalent of the number represented by each row of the matrix.

Define a main() method to coordinate the input, display the original structure, and output the computed decimal results for every row.
Example: 
Input:
        m=1, n=3, elements of the matrix: 2 3 1

Output:
        Original Matrix:
         2 3 1

        Decimal equivalent of row 1=153
*/

/*
Algorithm:
Step 1: Start
Step 2: Accept the order of the matrix
Step 3: Reject invalid inputs for rows and columns
Step 4: Accept individual elements of matrix
Step 5: Display Original Matrix
Step 6: Apply necessary conditions to convert octal number to decimal number
Step 7: Display the Decimal equivalent of each row
Step 8: Stop
*/

import java.util.Scanner;
class Octal_Matrix
{
    static Scanner sc = new Scanner(System.in);
    static int a[][];
    public static void main(String args[])
    {
        a = input();
        System.out.println();
        System.out.println("Original Matrix:");
        display(a);
        System.out.println();
        convert(a);
    }

    static int[][] input()
    {
        System.out.println("Enter The no. of rows of Matrix");
        int m=sc.nextInt();
        if(m <= 0)
        {
            System.out.println("Invalid input for rows. Please enter a positive integer.");
            return input();
        }
        System.out.println("Enter The no. of columns of Matrix");
        int n=sc.nextInt();
        if(n <= 2 || n >= 6)
        {
            System.out.println("Invalid input for columns. Please enter an integer between 3 and 5.");
            return input();
        }
        
        a = new int[m][n];
        System.out.println("Enter the individual Elements");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
               a[i][j]=sc.nextInt();
        }

        boolean allZeros = true;
        for(int i=0; i<m; i++)        
        {
            for(int j=0; j<n; j++)            
            {
                if(a[i][j] != 0)                
                {
                    allZeros = false;
                    break;
                }
            }

            if(!allZeros)                
                break;
        }

        if(allZeros)        
        {
            System.out.println("Matrix cannot be entirely composed of zeros. Please enter valid octal digits.");
            return input();
        }
        return a;
    }

    static void display(int a[][])
    {
       for(int i=0; i<a.length; i++)
       {
          for(int j=0; j<a[i].length; j++)
            System.out.print(a[i][j]+ " ");
          System.out.println();
       }
    }

    static int form_number(int a[][], int row)
    {
        int num = 0;
        for (int i = 0; i < a[row].length; i++) 
            num = num * 10 + a[row][i];

        return num;
    }

    static void convert(int a[][])
    {
        int octal, decimal, power;
        for (int i = 0; i < a.length; i++) 
        {
            decimal=0;
            power = 0;
            octal = form_number(a, i);
            while (octal != 0) 
            {
                 int lastDigit = octal % 10;          
                 decimal += lastDigit * Math.pow(8, power); 
                 octal /= 10;                         
                 power++;                            
            }

            System.out.println("Decimal equivalent of row " + (i + 1) + "=" + decimal);
        }
    }
} 
