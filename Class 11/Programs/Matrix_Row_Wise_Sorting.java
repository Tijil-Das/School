//A Java program to sort each row of a 2D array.

/*
Algorithm:
Step 1: Start
Step 2: Accept the order of the matrix
Step 3: Accept individual elements of matrix
Step 4: Display Original Matrix
Step 5: Apply necessary conditions to sort each row of the matrix in ascending order using Bubble Sort method
Step 6: Display the Sorted  Matrix
Step 7: Stop
*/

import java.util.*;
class Matrix_Row_Wise_Sorting
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size of the Square Matrix");
         int n, i, j, k, temp=0;
         n=sc.nextInt();
         int a[][]=new int[n][n];
         
         System.out.println("Enter the individual Elements");
         for(i=0; i<n; i++)
         {
            for(j=0; j<n; j++)
                a[i][j]=sc.nextInt();
         }
         
         System.out.println("Original Matrix");
         for(i=0; i<n; i++)
         {
            for(j=0; j<n; j++)
                System.out.print(a[i][j]+ " ");
            System.out.println();
         }
         
         for(k=0; k<n; k++)
         {
             for(i=0; i<n; i++)
             {
                 for(j=0; j<n-1; j++)
                 {
                     if(a[k][j]>a[k][j+1])
                     {
                       temp=a[k][j];
                       a[k][j]=a[k][j+1];
                       a[k][j+1]=temp;
                     }
                 }
             }
         }
         
         System.out.println("Sorted Matrix");
         for(i=0; i<n; i++)
         {
            for(j=0; j<n; j++)
                System.out.print(a[i][j]+ " ");
            System.out.println();
         }
    }
}
/*

// VARIABLE DESCRIPTION

n     - Stores the order (size) of the square matrix
a     - 2D integer array that stores the matrix elements
i     - Loop control variable used for row traversal
j     - Loop control variable used for column traversal
k     - Loop control variable used to select each row for sorting
temp  - Temporary variable used for swapping elements during sorting
sc    - Scanner object used to take input from the user

 */
