//A program to find the minimum and maximum elements in a square matrix

/*
Algorithm:
Step 1: Start
Step 2: Accept the order of the square matrix
Step 3: Accept the individual elements of the matrix
Step 4: Display the original matrix
Step 5: Display maximum and minimum elements of the matrix
Step 6: Stop
*/


import java.util.*;
class Matrix_Min_Max
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n, i,j, min, max;
        System.out.println("Enter The Order of Matrix");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        
        System.out.println("Enter Matrix Elements");
               
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
             a[i][j]=sc.nextInt();
        }
        
        System.out.println("Original Matix");
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
              System.out.print(a[i][j] + "\t");
            System.out.println();
        }
                
        min= a[0][0];
        max = min;
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(a[i][j]<min)
                min=a[i][j];
                
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        
        System.out.println("Maximum Element is:" +max);
        System.out.println("Minimun Element is:" + min);
    }
}

/*
Variable Description:
n - to store the order of the square matrix
i,j - loop variables
a[][] - to store the elements of the matrix
min - to store the minimum element of the matrix
max - to store the maximum element of the matrix
*/