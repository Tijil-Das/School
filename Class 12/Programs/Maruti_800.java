//Write a Java program to implement multilevel inheritance example

/*
Algorithm:
Step 1: Declare the parent class Car
Step 2: Declare the data member and member functions of the parent class Car
Step 3: Declare the immediate child of the class car as Maruti
Step 4: Declare the data member and member functions of the class Maruti
Step 5: Declare the grand-child of the class Car as Maruti_800
Step 6: Declare the data member and the member functions of the class Maruti_800 and also inherit the property from it’s immediate parent class Maruti and also inherit the property from it’s grand-parent c;lass Car
Step 7: Declare the object from the Maruti_800 class and invoke the member functions
*/

class Car
{
   public Car()
   {
        System.out.println("Class Car");
   }

   public void vehicleType()
   {
        System.out.println("Vehicle Type: Car");
   }   
}

class Maruti extends Car
{
   public Maruti()
   {
        System.out.println("Class Maruti");
   }

   public void brand()
   {
        System.out.println("Brand: Maruti");
   }
 
   public void speed()
   {
        System.out.println("Max: 90Kmph");
   }  
}

public class Maruti_800 extends Maruti
{  
   public Maruti_800()
   {
        System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
        System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
        Maruti_800 obj=new Maruti_800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
   } 
}

/*
Variable Description:
obj: Object of the Maruti_800 class used to invoke the inherited and overridden member functions.
args: Stores the command-line arguments passed to the main() method.
*/