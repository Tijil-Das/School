//A Java program to implement binary search using recursion
//Algorithm, output, VD: Not uploaded(read Note)

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