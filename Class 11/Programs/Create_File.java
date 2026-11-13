//A program to create a new text file in Java

/*
Algorithm:
Step 1: Start
Step 2: Prompt the user to enter the file name along with the extension
Step 3: Use File() class and create an object
Step 4: While using create new file method, create the new text file
Step 5: Display the approprite message after creating the file successfully
Step 6: Handle IO exception that may occur during the file creation
Step 7: Display the error mssage if the file hasn't been created successfully
Step 8: Stop
*/

import java.io.File;
import java.io.IOException;
import java.util.*;
class Create_File
{
    public static void main(String args[])
    {
        try
        {
            File obj=new File("abc.txt");
            
            if(obj.createNewFile())
            System.out.println("File "+ "'"+ obj.getName()+"'" + "Created Successfully");
            
            else
            System.out.println("File Already Exists");
        }
        
        catch(IOException e)
        {
            System.out.println("An Error Occured. Please try again");
        }
    }
}


