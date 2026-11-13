//A program to generate the mirror image of a matrix(Horizontal Mirroring). All elements of input matrix cannot be zero and, the number of rows of the input matrix must be greater than 2 and the number of columns of the input matrix must be lesser than 20.
//Output, VD: Not uploaded(read Note)

/*
Algorithm:
Step 1: Start
Step 2: Declare the class Mirror_Matrix and global variables
Step 3: Declare the method input() to accept the array and check various conditions:
        a) No.of matrix rows must be greater than 2 and no.matrix columns must be lesser than 20
        b) all elements cannot be zero
Step 4: Declare the method mirror() to find the mirror image of the input matrix(the 0th column will be shifted to ‘n-1’th column or vice-versa)
Step 5: Declare the method display() to display the original matrix as well as the Mirror image matrix.
Step 6: Declare the main() method to invoke the necessary methods.
Step 7: Stop
*/

import java.util.Scanner;
class Mirror_Matrix 
{
    static Scanner sc = new Scanner(System.in);
    static int a[][];
    public static void main(String args[])
    {
        a = input();
        System.out.println("Original Matrix");
        display(a);
        mirror(a);
        System.out.println();
        System.out.println("Horizontal Mirror Image of the Matrix:");
        display(a);
    }

    static void mirror(int a[][]) 
    {
        if (a == null || a.length == 0) 
            return;

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == null || a[i].length == 0) 
                continue;

            int col = a[i].length;
            for (int j = 0; j < col/2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][col - 1 - j];
                a[i][col - 1 - j] = temp;
            }
        }
    }
    
    static int[][] input()
    {
        System.out.println("Enter The no. of rows of Matrix");
        int r=sc.nextInt();
        if(r<=2)
        {
            System.out.println("Number of rows must be greater than 2. Please enter the number of rows again.");
            r=sc.nextInt();
        }
        System.out.println("Enter The no. of columns of Matrix");
        int c=sc.nextInt();
        if(c>=20)
        {
            System.out.println("Number of columns must be lesser than 20. Please enter the number of columns again.");
            c=sc.nextInt();
        }

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
