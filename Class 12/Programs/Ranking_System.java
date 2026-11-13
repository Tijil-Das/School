/*
A super class Record has been defined to store the names and ranks of 10 students. Define a sub class Rank to find the highest rank along with the name.
The details of both classes are given below:
Class name : Record

Data Members / instance variables:
name[ ] : to store the names of students
rnk[ ] : to store the ranks of students

Member functions:
Record() : constructor to initialize data members
void readvalues() : to store names and ranks
void display() : displays the names and the corresponding ranks

Class name : Rank

Data Members / instance variables:
index : integer to store the index of the topmost rank

Member functions
Rank() : constructor to invoke the base class constructor and to initialize index to 0.
void highest() : finds the index location of the topmost rank and stores it in index without sorting the array 6
void display() : displays the name and ranks along with the name having the topmost rank.
Specify the class Record giving details of the constructor(), void readvalues(), void display().
Using the concept of inheritance, specify the class Rank giving details of constructor(), void highest() and void display().
*/


/*
Algorithm:
Step 1: Declare the parent class Record.
Step 2: Declare the data members of the parent class.
Step 3: Declare the child class Rank and its own data members.
Step 4: Inherit the data members from the parent class and call the member function from the parent class.
*/

import java.util.*;

class Record // superclass
{
    Scanner sc = new Scanner(System.in);
    String name[];
    int rnk[];

    Record()
    {
        name = new String[50];
        rnk = new int[50];
    }

    void readvalues()
    {
        System.out.println("Input the Names And Ranks: ");

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter name of student " + (i + 1) + " : ");
            name[i] = sc.nextLine();

            System.out.print("Enter his/her rank : ");
            rnk[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    void display()
    {
        System.out.printf("%-12s %s%n", "Name", "Rank");
        System.out.println("--------------------");

        for(int i = 0; i < 10; i++)
        {
            System.out.printf("%-12s %d%n", name[i], rnk[i]);
        }
    }
}

class Rank extends Record // subclass
{
    int index;

    Rank()
    {
        super();
        index = 0;
    }

    void highest()
    {
        int min = rnk[0];

        for(int i = 0; i < 10; i++)
        {
            if(rnk[i] < min)
            {
                min = rnk[i];
                index = i;
            }
        }
    }

    void display()
    {
        super.display();
        highest();

        System.out.println("\nTop most rank = " + rnk[index]);
        System.out.println("Student with topmost rank = " + name[index]);
    }
}

public class Ranking_System
{
    public static void main(String args[])
    {
        Rank ob = new Rank();

        ob.readvalues();
        ob.display();
    }
}

/*
Variable Description:
name  : Stores the names of the 10 students.
rnk   : Stores the ranks of the 10 students.
index : Stores the index position of the student having the topmost rank.
min   : Stores the smallest rank found while searching for the topmost rank.
i     : Loop variable used to traverse the arrays.
ob    : Object of the subclass Rank used to invoke the member functions.
args  : Stores the command-line arguments passed to the program.
*/