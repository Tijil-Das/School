// A Java program to find the greatest and smallest element of each row of a 2D array

/*
Algorithm:
Step 1: Start
Step 2: Accept the order of the matrix (number of rows and columns)
Step 3: Accept the individual elements of the matrix
Step 4: Display the original matrix
Step 5: For each row, assume the first element as minimum and maximum
Step 6: Compare each element of the row to find the smallest and greatest values
Step 7: Display the smallest and greatest element of each row
Step 8: Stop
*/

import java.util.*;
class Matrix_Each_Row
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, min, max;

        System.out.println("Enter the order of the square matrix");
        n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter the matrix elements");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        System.out.println("Original Matrix");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }

        for(i = 0; i < n; i++)
        {
            min = a[i][0];
            max = a[i][0];

            for(j = 0; j < n; j++)
            {
                if(a[i][j] < min)
                    min = a[i][j];

                if(a[i][j] > max)
                    max = a[i][j];
            }

            System.out.println("Row " + (i + 1) + " -> Minimum: " + min + ", Maximum: " + max);
        }
    }
}

/*
VARIABLE DESCRIPTION
sc  - Scanner object to accept input from the user
n   - to store the order of the square matrix
i   - loop variable for rows
j   - loop variable for columns
a   - two dimensional array to store matrix elements
min - to store the smallest element of a row
max - to store the greatest element of a row
*/
