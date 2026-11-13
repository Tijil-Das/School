/*
A super class Box has been defined to calculate the volume of a box. Define a subclass MatchBox to calculate the volume of a matchbox by using the required data members of the super class and to store its weight.

The details are given below:

Class name : Box

Data members/instance variables:
width  : to store the width of the box in decimal
height : to store the height of the box in decimal
depth  : to store the depth of the box in decimal

Member functions:
Box() : default constructor
Box() : parameterized constructor to assign values to the data members
double getVolume() : calculate and return the volume of the box as width * height * depth




Class name : MatchBox

Data members/instance variables:
weight : to store the weight of the matchbox in decimal

Member functions:
MatchBox() : default constructor
MatchBox() : parameterized constructor to assign values to the data members of both the classes
double getVolume() : calculate and return the volume of the matchbox by calling the getVolume() function of the super class

Using the concept of inheritance, specify the class Box giving details
of the constructors and getVolume(). Specify the class MatchBox giving
details of the constructors and getVolume().
*/


/*
Algorithm:
Step 1: Declare the parent class Box.
Step 2: Declare the data members of the parent class.
Step 3: Declare the child class MatchBox and its own data members.
Step 4: Inherit the data members from the parent class and call the member function from the parent class.
*/


class Box // Superclass
{
    double width;
    double height;
    double depth;

    Box()
    {
    }

    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume()
    {
        return width * height * depth;
    }
} // End of superclass Box


public class MatchBox extends Box // Subclass
{
    double weight;

    MatchBox()
    {
    }

    MatchBox(double w, double h, double d, double m)
    {
        super(w, h, d); // Initializing superclass data members
        weight = m;
    }

    double getVolume()
    {
        return super.getVolume(); // Returning volume by calling the superclass getVolume()
    }

    public static void main(String args[])
    {
        MatchBox mb1 = new MatchBox(10, 10, 10, 10); // Creating an object of the subclass
        System.out.println("Width of MatchBox 1 is " + mb1.width);
        System.out.println("Height of MatchBox 1 is " + mb1.height);
        System.out.println("Depth of MatchBox 1 is " + mb1.depth);
        System.out.println("Weight of MatchBox 1 is " + mb1.weight);
        System.out.println("Volume of MatchBox 1 is " + mb1.getVolume());
    }
} // End of subclass MatchBox


/*
Variable Description:
width   : Stores the width of the box in decimal.
height  : Stores the height of the box in decimal.
depth   : Stores the depth of the box in decimal.
w       : Stores the width passed to the constructor.
h       : Stores the height passed to the constructor.
d       : Stores the depth passed to the constructor.
m       : Stores the weight passed to the constructor.
weight  : Stores the weight of the matchbox in decimal.
mb1     : Object of the subclass MatchBox used to access its data members and member functions.
args    : Stores the command-line arguments passed to the program.
*/