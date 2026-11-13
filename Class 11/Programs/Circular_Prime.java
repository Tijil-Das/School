//A number is said to be circular prime if the number and its reverse are prime.

import java.util.*;
class Circular_Prime
{
    static Circular_Prime obj=new Circular_Prime();

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n; 
        System.out.print("Enter a Number: ");
        n=sc.nextInt();
        if(obj.Is_Circular_Prime(n))
            System.out.println(n+" is a Circular Prime");
        else
            System.out.println(n+" is not a Circular Prime");
        
    }

    boolean Is_Circular_Prime(int n)
    {
        if(obj.Check_Prime(n, 1, 0) && obj.Check_Prime(obj.reverse(n), 1, 0))
          return true;
        else
          return false;
    }
    
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

    
    int reverse(int f)
    {
        int d=0, reverse=0;
        for(int i=f; i>0; i=i/10)
        {
            d=i%10;
            reverse=reverse*10+d;
        }
        return reverse;
    }
}
