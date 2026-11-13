//A Java program to sort each row of a 2D array.
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;

class Row_Wise_Sorting 
{

    static Scanner sc = new Scanner(System.in);
    static int a[][];
    public static void main(String[] args) 
    {
        a=input();
        System.out.println();
        System.out.println("Original Matrix");
        display(a);

        sortRows(a);
        System.out.println();
        System.out.println("Sorted Matrix");
        display(a);
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

    static void sortRows(int a[][]) 
    {
        for (int i = 0; i < a.length; i++) {
            int n = a[i].length;
            for (int j = 0; j < n - 1; j++) {
                int minIdx = j;
                for (int k = j + 1; k < n; k++) {
                    if (a[i][k] < a[i][minIdx]) {
                        minIdx = k;
                    }
                }
                if (minIdx != j) {
                    int temp = a[i][j];
                    a[i][j] = a[i][minIdx];
                    a[i][minIdx] = temp;
                }
            }
        }
    }

    static void display(int a[][]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

