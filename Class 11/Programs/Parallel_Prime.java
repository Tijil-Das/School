//A number is said to be parallel prime if the number and all it's digits are prime.


import java.util.Scanner;

class Parallel_Prime
{
    static Parallel_Prime obj=new Parallel_Prime();
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (obj.Is_Parallel_Prime(n)) 
        {
            System.out.println("It's a Parallel Prime");
        } else 
        {
            System.out.println("It's not a Parallel Prime");
        }
        
    }

    boolean Is_Parallel_Prime(int n)  
    {
        return obj.Check_Prime(n, 1, 0) && obj.Are_All_Digits_Prime(n); 
    }


    boolean Are_All_Digits_Prime(int n) 
    {
        int temp = n;
        while (temp > 0) 
        {
            int digit = temp % 10;
            if (!obj.Check_Prime(digit, 1, 0)) 
                return false; 
            temp=temp/10; 
        }
        return true; 
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
}
