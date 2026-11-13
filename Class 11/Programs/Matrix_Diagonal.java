//A program to display the left and right diagonal elements of a square matrix

/*
Algorithm:
Step 1: Start
Step 2: Accept the size of the square matrix
Step 3: Accept the individual elements of the matrix
Step 4: Display the original matrix
Step 5: Check the condition i==j to display the left diagonal elements
Step 6: Check the condition i+j==n-1 to display the right diagonal elements
Step 7: Display both diagonal elements
Step 8: Stop
*/

import java.util.*;
class  Matrix_Diagonal
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size of the Square Matrix");
         int n, i, j;
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
                System.out.print(a[i][j]+"\t");
            System.out.println();
         }
         
         System.out.println("Left Diagonal Elements:");
         for (i = 0; i < n; i++)
         {
            for (j = 0; j < n; j++)
            {
               if (i == j)
                 System.out.print(a[i][j] + "\t");
               else
                 System.out.print("\t");
            }
            System.out.println();
         }

         System.out.println("Right Diagonal Elements:");
         for (i = 0; i < n; i++)
         {
            for (j = 0; j < n; j++)
            {
               if (i + j == n - 1)
                 System.out.print(a[i][j] + "\t");
               else
                 System.out.print("\t");
            }
            System.out.println();
         }
    }
}

/*

Variable Description:
n - to store the size of the square matrix
i,j - loop variables
a[][] - to store the elements of the matrix

*/
