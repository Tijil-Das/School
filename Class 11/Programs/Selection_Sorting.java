//A program to implement Selection Sorting in Java

import java.util.*;
class Selection_Sorting
{
   public static void main(String args[]) 
   {

     Scanner sc=new Scanner(System.in);
     int n, temp=0, i, j, min=0, position=0;

     System.out.println("Enter the Size Of Array");

     n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter Individual Elements");
     for(i=0; i<n; i++)//accepting the elements
        a[i]=sc.nextInt();


     System.out.println("Original array:");
     for(i=0; i<n; i++)
        System.out.print(a[i]+" ");
        
     for (i=0; i<n-1; i++)
     {
        min=a[i];
        position=i;
        for(j=i+1; j<n; j++)
        {
            
            if(min>a[j])
            {
                min=a[j];
                position=j;
            }
        }
        temp=a[i];
        a[i]=a[position];
        a[position]=temp;
     }

     System.out.println();
     System.out.println();
     System.out.println("Sorted Array:");
     for(i=0; i<n; i++)
      System.out.print(a[i]+" ");
   }
}

/*
Variable Description:
n - to store the size of the array
i,j - loop variables
a[] - to store the elements of the array
temp - to temporarily store an element during swapping
min - to store the minimum element found in the unsorted part of the array
position - to store the index of the minimum element found
*/