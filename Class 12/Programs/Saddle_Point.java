//A program to find out saddle point of a 2D Square matrix. All elements of the input matrix cannot be zero.
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;
class Saddle_Point
{
    static Scanner sc=new Scanner(System.in);
    static int a[][];
    public static void main(String args[])
    {
        a = input();
        System.out.println();
        System.out.println("Original Matrix:");
        display(a);
        System.out.println();
        find_Saddle_Point(a);
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

    static int[][] input()
    {
        System.out.println("Enter The no. of rows of Matrix");
        int r=sc.nextInt();
        System.out.println();
        System.out.println("Enter The no. of columns of Matrix");
        int c=sc.nextInt();
        System.out.println();
        a = new int[r][c];
        System.out.println("Enter the individual Elements");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
               a[i][j]=sc.nextInt();
        }
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(a[i][j]!=0)
                    return a;
            }
        }
        System.out.println("All elements cannot be zero. Please enter the matrix again.");
        a = input();
        return a;
    }

    // Find and print saddle points: element that is minimum in its row and maximum in its column
    static void find_Saddle_Point(int a[][])
    {
        int n = a.length;
        boolean found = false;
        for (int i = 0; i < n; i++) 
        {
            int minVal = a[i][0];
            int minCol = 0;
            for (int j = 1; j < n; j++) {
                if (a[i][j] < minVal) {
                    minVal = a[i][j];
                    minCol = j;
                }
            }
            boolean isMaxInCol = true;
            for (int k = 0; k < n; k++) {
                if (a[k][minCol] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }
            if (isMaxInCol) {
                System.out.println("Saddle Point = " + minVal + " at Position: " + i + "," + minCol);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}

