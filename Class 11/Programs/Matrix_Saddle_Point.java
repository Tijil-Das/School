//A program to find out saddle point of a 2D Square matrix

/*
Algorithm:
Step 1: Start
Step 2: Accept order of matrix
Step 3: Accept individual element of the matrix
Step 4: Display the original matrix   
Step 5: Find out the saddle point of the matrix by using the necessary condition(maximum row element and mximum Column element)
Step 6: Display Saddle point of Matrix
Step 7: Stop
*/
import java.util.*;
class Matrix_Saddle_Point
{
    public static void main(String args[])
    {
        int max, k, i, j, n, min, x, f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Order of Matrix");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter individual elements of the Matrix");  
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
        
        for(i=0;i<n;i++)
        {
             min=a[i][0];
             max=min;
             x=0;
             for(j=0;j<n;j++)
             {
                 if(a[i][j]<min)
                 {
                     max=a[0][x];
                     for(k=0;k<n;k++)
                     {
                         if(a[k][x]>max)
                         max=a[k][x];
                     }
                 }
                 if(max==min)
                 {
                     System.out.println("Saddle Point=" +max+ " at Position: " +i+ "," +j);
                     f=1;
                     break;
                 }
             }
             
             if(f==0)
             System.out.println("No Saddle Point");
        }
    }
}

/*
Variable Description:
n - to store the order of the square matrix
a[][] - to store the elements of the matrix
i,j,k - loop variables
max - to store the maximum element of the column 
*/