/*
A super class Perimeter has been defined to calculate the perimeter of a
parallelogram. Define a subclass Area to compute the area of the
parallelogram by using the required data members of the super class.

The details are given below:

Class name : Perimeter

Data members/instance variables:
a : to store the length in decimal
b : to store the breadth in decimal

Member functions:
Perimeter() : parameterized constructor to assign values to data members
double Calculate() : calculate and return the perimeter of a parallelogram as 2 * (length + breadth)
void show() : to display the data members along with the perimeter of the parallelogram




Class name : Area

Data members/instance variables:
h    : to store the height in decimal
area : to store the area of the parallelogram

Member functions:
Area() : parameterized constructor to assign values to data members of both the classes
void doarea() : compute the area as (breadth * height)
void show() : display the data members of both classes along with the area and perimeter of the parallelogram.

Specify the class Perimeter giving details of the constructor, void Calculate() and void show(). Using the concept of inheritance, specify the class Area giving details of the constructor(), void doarea() and void show().
*/


/*
Algorithm:
Step 1: Declare the parent class Perimeter.
Step 2: Declare the data members of the parent class.
Step 3: Declare the child class Area and its own data members.
Step 4: Inherit the data members from the parent class and call the member function from the parent class.
*/


import java.util.Scanner;
class Perimeter // Superclass
{
    double a, b;

    Perimeter(double x, double y)
    {
        a = x;
        b = y;
    }

    double Calculate()
    {
        double p = 2 * (a + b);
        return p;
    }

    void show()
    {
        System.out.println("Length = " + a);
        System.out.println("Breadth = " + b);
        System.out.println("Perimeter = " + Calculate()); // Printing perimeter by calling Calculate()
    }
} // End of superclass Perimeter


class Area extends Perimeter // Subclass
{
    double h, area;

    Area(double x, double y, double z)
    {
        super(x, y); // Initializing superclass data members by calling its constructor
        h = z;
    }

    void doarea()
    {
        area = b * h;
    }

    void show()
    {
        super.show(); // Calling the superclass function show()
        System.out.println("Height = " + h);
        System.out.println("Area = " + area);
    }
} // End of subclass Area


public class Dimensions // Class containing the main() method and executing the program
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length : ");
        double x = Double.parseDouble(sc.nextLine());

        System.out.print("Enter The Breadth : ");
        double y = Double.parseDouble(sc.nextLine());

        System.out.print("Enter The Height : ");
        double z = Double.parseDouble(sc.nextLine());

        Area ob = new Area(x, y, z); // Creating an object of the subclass

        System.out.println("*** Output ***");

        ob.doarea();
        ob.show(); // Calling show() function of the subclass
    }
}


/*
Variable Description:
a       : Stores the length of the rectangle.
b       : Stores the breadth of the rectangle.
x       : Stores the length entered by the user.
y       : Stores the breadth entered by the user.
z       : Stores the height entered by the user.
h       : Stores the height of the rectangle.
p       : Stores the calculated perimeter of the rectangle.
area    : Stores the calculated area of the rectangle.
ob      : Object of the subclass Area used to invoke its methods.
sc      : Scanner object used to accept input from the user.
args    : Stores the command-line arguments passed to the program.
*/
