/*
Write a java program to create a class Cube with the following:

Data Members: length, breadth, height of integer type. 

Data Functions: 
- A parameterized constructor.
- A default constructor
- A member function getVolume() of integer data type to calculate the volume of a cube. 

Declare a child class called Special_Cube which also contains a data member int weight and declare a parameterized constructor with two parameters and three parameters seperately. Create an object from the child class and invoke the methods seperately.
*/

/*
Algorithm:
Step 1: Declare the parent class Cube.
Step 2: Declare the data members of the parent class.
Step 3: Declare the child class Special_Cube and its own data members.
*/

class Cube
{
    int length;
    int breadth;
    int height;

    public int getVolume()
    {
        return (length * breadth * height);
    }

    Cube()
    {
        length = 10;
        breadth = 10; // this(10, 10);
        System.out.println("Finished with Default Constuctor of Cube");
    }

    Cube(int l, int b)
    {
        this(l, b, 10);
        System.out.println("Finished with Parametrized Constuctor having 2 params of Cube");
    }

    Cube(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Finished with Parametrized Constuctor having 3 params of Cube");
    }
}

public class Special_Cube extends Cube
{
    int weight;

    Special_Cube()
    {
        weight = 10; // super();
    }

    Special_Cube(int l, int b)
    {
        this(l, b, 10);
        System.out.println("Finished with Parametrized Constuctor having 2 params of SpecialCube");
    }

    Special_Cube(int l, int b, int h)
    {
        super(l, b, h);
        weight = 20;
        System.out.println("Finished with Parametrized Constuctor having 3 params of SpecialCube");
    }

    public static void main(String[] args)
    {
        Special_Cube specialObj1 = new Special_Cube();
        Special_Cube specialObj2 = new Special_Cube(10, 20);

        System.out.println("Volume of SpecialCube1 is : " + specialObj1.getVolume());
        System.out.println("Weight of SpecialCube1 is : " + specialObj1.weight);

        System.out.println("Volume of SpecialCube2 is : " + specialObj2.getVolume());
        System.out.println("Weight of SpecialCube2 is : " + specialObj2.weight);
    }
} 

/*
Variable Description:
length       : Stores the length of the cube as an integer.
breadth      : Stores the breadth of the cube as an integer.
height       : Stores the height of the cube as an integer.
weight       : Stores the weight of the special cube as an integer.
l            : Stores the length passed as a parameter to the constructor.
b            : Stores the breadth passed as a parameter to the constructor.
h            : Stores the height passed as a parameter to the constructor.  
specialObj1  : Object of the SpecialCube1 class created using the default constructor.
specialObj2  : Object of the SpecialCube1 class created using the parameterized constructor.
args         : Stores the command-line arguments passed to the program.
*/
