//A program to create a text file and write some portions of text in the file

/*
Algorithm:
Step 1: Start
Step 2: Prompt the user to enter source file name
Step 3: Create file writer class and also create an object of the class towrite text
Step 4: Using write() method, enter some text inside the file nd display appropriate message after file created successfully
Step 5: Close the file operation 
Step 6: Display error message if file hasn't been created
Step 7: Stop  
*/
import java.io.FileWriter;
import java.io.IOException;
class Write_File
{
    public static void main(String args[])
    {
        try
        {
            FileWriter obj=new FileWriter("xyz.txt");
            obj.write("We Have Successfully Written to the File");
            obj.close();
            
            System.out.println("Successfully Written Content");
        }
        
        catch(IOException e)
        {
            System.out.println("An Error Occured");
        }
    }
}