//Write a java program to accept the current date, month and year as well as mention the day of 1st January of the current year and print the current day

/*
Algorithm:
Step 1: Start
Step 2: Declare a String[] array to store the names of the seven days of the week (index 1 = MONDAY to index 7 = SUNDAY)
Step 3: Declare an integer array to store the number of days in each month (index 1 = January to index 12 = December)
Step 4: Accept the date (dd, mm, yyyy) from the user
Step 5: Check whether the year is a leap year (divisible by 400, or divisible by 4 but not by 100). If yes, set the number of days of February to 29
Step 6: Verify that the year is positive, the month is between 1 and 12 and the day is between 1 and the number of days of that month. If not, display "Invalid date" and go to Step 10
Step 7: Accept the day on 1st January of that year and convert it to its index wd (1 to 7). If it does not match any day name, display "Invalid day name" and go to Step 10
Step 8: Add the number of days of all the months before the given month and then add dd to get s, the number of days elapsed since 1st January (1st January itself = 1)
Step 9: Calculate the day index t = (wd + s - 2) % 7 + 1 and display day[t]
Step 10: Stop
*/

import java.util.*;
class day
{

    public static void main(String arg[])
    {
        Scanner br = new Scanner(System.in);
        String day[]={"","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        String b;
        int nd[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int dd,mm,yy,i,s,wd,t;
        s=0;
        wd=0;
        System.out.println("Enter day in dd format.");
        dd=br.nextInt();
        System.out.println("Enter month in mm format.");
        mm=br.nextInt();
        System.out.println("Enter year in yyyy format.");
        yy=br.nextInt();
        if((yy%400==0)||(yy%4==0 && yy%100!=0))
            nd[2]=29;
        if(yy>0 && mm>0 && mm<=12 && dd>0 && dd<=nd[mm])
        {
            System.out.println("Enter day on 1st January ");
            System.out.println(" MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY");
            b=br.next().toUpperCase();
            for(i=1;i<8;i++)
                if(b.equals(day[i]))
                    wd=i;
            if(wd==0)
                System.out.println("Invalid day name");
            else
            {
                for(i=1;i<mm;i++)
                    s=s+nd[i];
                s=s+dd;
                t=(wd+s-2)%7+1;
                System.out.println(day[t]);
            }
        }
        else
            System.out.println("Invalid date");
    }
}

/*
Variable Description:
dd - The day of the month (1 to 31)
mm - The month of the year (1 to 12)
yy - The year (positive integer)
nd - An array to store the number of days in each month
wd - The index of the day on 1st January (1 to 7)
s - The number of days elapsed since 1st January
t - The index of the current day (1 to 7)
i - Loop control variable
*/