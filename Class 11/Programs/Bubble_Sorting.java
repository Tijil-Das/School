//A program to Arrange an array using Bubble Sorting

import java.util.*;
class Bubble_Sorting
{
    

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Individual Elements");
        Bubble_Sorting.input(a, 0);

        System.out.println("Original Array:");
        Bubble_Sorting.display(a, 0);

        Bubble_Sorting.bubbleSort(a, a.length);

        System.out.println("Sorted Array:");
        Bubble_Sorting.display(a, 0);
    }

    // Recursive method to input array elements
    static void input(int a[], int i)
    {
        Scanner sc = new Scanner(System.in);
        if(i == a.length)
            return;

        a[i] = sc.nextInt();
        Bubble_Sorting.input(a, i + 1);
    }

    // Recursive method to display array elements
    static void display(int a[], int i)
    {
        if(i == a.length)
        {
           System.out.println();
           System.out.println();
           return;
        }

        System.out.print(a[i] + " ");
        Bubble_Sorting.display(a, i + 1);
    }

    // Recursive Bubble Sort method
    static void bubbleSort(int a[], int n)
    {
        if(n == 1)
            return;

        Bubble_Sorting.bubblePass(a, 0, n);
        Bubble_Sorting.bubbleSort(a, n - 1);
    }

    // One pass of bubble sort using recursion
    static void bubblePass(int a[], int i, int n)
    {
        if(i == n - 1)
            return;

        if(a[i] > a[i + 1])
        {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        Bubble_Sorting.bubblePass(a, i + 1, n);
    }
}

/*
//VARIABLE DESCRIPTION

n- Stores the size of the array
a- Stores the array elements
i- Index variable used in recursion
temp- used for swapping
n- Represents the unsorted portion of the array
*/
