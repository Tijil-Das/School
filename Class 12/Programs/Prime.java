//A Java program to determine if a given integer is a prime number using a recursive function.
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;
class Prime
{
    
    boolean Check_Prime(int n, int i, int c)
    {
        if(i<=n)
        {
           if(n%i==0)
             c++;
           i++;
           return Check_Prime(n, i, c);
        }
        if(c==2)
          return true;
        else
          return false;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println();
        Prime obj=new Prime();

        if(obj.Check_Prime(num,1,0))
          System.out.println(num+" is a Prime Number");
        else
          System.out.println(num+" is not a Prime Number");
        
    } 
}

