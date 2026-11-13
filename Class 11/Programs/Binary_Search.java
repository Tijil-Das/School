//A Java program to implement binary search

/*
Algorithm:
Step 1: Start
Step 2: Define the class binary_search and initialize the array using Binsearch()
Step 3: Accept array elements through fillarray() and sort them in ascending order
Step 4: Set the minimum and maximum positions of the array and compute mid = (min + max) / 2
Step 5: Define the function bin_search() to compare the search element with arr[mid]
Step 6: If arr[mid] > search element, search in the left half (max = mid - 1)
Step 7: If arr[mid] < search element, search in the right half (min = mid + 1)
Step 8: If arr[mid] = search element, return the position indicating successful search
Step 9: Accept the search element in main(), invoke binary search and display the result
Step 10: Stop

*/

import java.util.Scanner;
class Binary_Search
{
    Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    public void Binsearch(int nn)
    {
        n = nn;
        arr= new int[n];
    }

    public void input()
    {
        System.out.println("Enter Elements");
        for(int i = 0; i < n; i++)
           arr[i] = sc.nextInt();
        
    }

    public void sort()
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public int bin_search(int l, int u, int key)
    {
        if(l > u)
            return -1;

        int m = (l + u) / 2;

        if(key == arr[m])
            return m;

        if(key > arr[m])
            return bin_search(m + 1, u, key);

        return bin_search(l, m - 1, key);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements:");
        int size = Integer.parseInt(sc.nextLine());
        Binary_Search obj = new Binary_Search();
        obj.Binsearch(size);
        System.out.println();
        obj.input();
        obj.sort();
        System.out.println();
        System.out.println("Element to be searched:");
        int key = sc.nextInt();
        System.out.println();
        int i = obj.bin_search(0, size - 1, key);
        if(i == -1)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found in the input array");
    }
}

/*
VARIABLE DESCRIPTION
    arr[]- to store the array elements
    n - to store the number of elements in the array
    l - to store the lower index for binary search
    u - to store the upper index for binary search
    m - to store the middle index of the current search range
    key - to store the element to be searched
    temp - temporary variable used for swapping during sorting
    size - to store the number of elements entered by user
    i - to store the index returned by the binary search function
*/
