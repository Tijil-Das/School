/*Design a class NumDude to check whether a number is a dudeney number or not. A dudeney number is a positive integer that  is a perfect cube such that the sum of each digit is equal to the cube root of the number.(Ex: 5832)
Some of the class members are given below:
(i)Data member or instance variables:
1.      num: to store a positive integer number
(ii)Member Methods:
   	1. NumDude(): Default constructor to initialize the data members with a legal initial value
2.      void input(): to accept positive integer numbers
3.      int sumDigits(int x): return the sum of the digits of the number ‘x’ using recursive function
4.      void isDude(): check if the given number is a Dudeney number by invoking the sumDigits(int x)
 
Specify the class numDude giving details of the constructor, void input(), int sumDigits(int x), and void isDude(). Define a main function to create an object and call the function accordingly to complete the task.
*/

//Algorithm, output, VD: Not uploaded(read Note)

import java.util.*;
class Dudeney
{
	int num;
	Dudeney()
	{
		num=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		num=sc.nextInt();
		if(num<=0)
		{
			System.out.println("Please enter a positive integer:");
			input();
		}
	}

	int sumDigits(int x)
	{
		if(x==0)
			return 0;
		return (x%10)+sumDigits(x/10);
	}

	void isDude()
	{
		int cubeRoot=(int)Math.cbrt(num);
		if(cubeRoot*cubeRoot*cubeRoot==num && sumDigits(num)==cubeRoot)
			System.out.println(num+" is a Dudeney number.");
		else
			System.out.println(num+" is not a Dudeney number.");
	}

	public static void main(String[] args)
	{
		Dudeney d=new Dudeney();
		d.input();
		d.isDude();
	}
}