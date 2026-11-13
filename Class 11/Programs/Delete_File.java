//Write a Java program to delete an existing file
/*
Algorithm
Step 1: Start
Step 2: Ptrompt the user to enetr the source file
Step 3: Create a file class object to open the file
Step 4: Using delete() method, delete the file from the actual path
Step 5: Dispay the appropriate message after deletion
Step 6: Disply error message if the file doesn't exist before deletion
Step 7: Stop
*/
import java.io.File;
class Delete_File
{
    public static void main(String args[])
    {
        File obj=new File("abc.txt");
        if(obj.delete())
        {
            System.out.println("Deleted File: " +obj.getName());
        }
        else
        {
            System.out.println("Failed to Delete File!");
        }
    }
}