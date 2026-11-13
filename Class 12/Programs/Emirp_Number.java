//A number that is prime and also prime when its digits are reversed is called an Emirp number. For example, 13 is an Emirp number because it is prime and its reverse.
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;

class Emirp_Number
{
    static Scanner sc = new Scanner(System.in);
    int n, rev, f;

    public static void main(String[] args) 
    {
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        Emirp_Number obj = new Emirp_Number(input);
        obj.isEmirp();
    }

    Emirp_Number(int nn) 
    {
        n = nn;
        rev = 0;
        f = 1;
    }

    int isPrime(int x) 
    {
        int c=0;
        for (int f = 1; f <= x; f++) 
        {
            if (x%f==0)
              c++;
        }
        return c;
    }

    void isEmirp() 
    {
        int t=n;
        while (t!=0)
        {
            int d=t%10;
            rev=rev*10+d;
            t=t/10;
        }

        if (isPrime(n)==2 && isPrime(rev)==2)
            System.out.println(n + " is an Emirp Number");
        else
            System.out.println(n + " is not an Emirp Number");
    }
}
