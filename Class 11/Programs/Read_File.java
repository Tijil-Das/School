//A program to read a text file
/*
Algorithm:
Step 1: Start
Step 2: Prompt the user to enter the source file name using the file class
Step 3: Execute iterative statement to fetch the content from the text file
Step 4: Close the file operation
Step 5: Display error message if doesn't exist or no content is available
Step 6: Stop
*/
import java.io.File;
import java.util.Scanner;
import java.io.*;

class Read_File
{
    public static void main(String args[])
    {
        try
        {
            File obj=new File("xyz.txt");
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine())
            {
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        
        catch(IOException e)
        {
            System.out.println("An Error Occured");
        }
    }
}