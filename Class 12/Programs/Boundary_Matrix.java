//A program to display the boundary elements of a 2D matrix
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;
class Boundary_Matrix
{
    static Scanner sc=new Scanner(System.in);
    static int a[][];
    public static void main(String args[])
    {
        a = input();
        System.out.println("Original Matrix:");
        display(a);
        System.out.println();
        System.out.println("Boundary Elements of the Matrix:");
        display_boundary(a);
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

    static void display_boundary(int a[][])
    {
        int col=a.length;
        int row=a[0].length;
        for(int i=0; i<col; i++)
        {
            for(int j=0; j<row; j++)
            {
                if(i==0 || i==col-1 || j==0 || j==row-1)
                    System.out.print(a[i][j]+ " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}