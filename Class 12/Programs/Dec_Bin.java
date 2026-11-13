//Program to convert decimal to binary using recursion
//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;
public class Dec_Bin 
{
    int num; long bin;
    Scanner sc=new Scanner(System.in);

    public Dec_Bin(int n)
    {
        num=n;
        bin=0L;
    }

    public long convert()
    {
        if(num==0)
         return 0;
        else if(num==1)
         return 1L; 
        else
        {
            int rem=num%2;
            num/=2; 
            return (convert()*10L+rem);
        }
    }
    
    public void display()
    {
        System.out.println("Decimal number: "+num);
        bin=convert();
        System.out.println("Binary equivalent: "+bin);
    }
    
    public static void main()
    {
        System.out.println("Positive decimal integer:");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dec_Bin obj=new Dec_Bin(n);
        obj.display();
    } 
        
}    

