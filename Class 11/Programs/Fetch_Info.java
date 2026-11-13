//Write a program to get the necessary information about a file(name, path: where file actually exists, whether the file is writable or not, whether the file is readable or not, and also display the size bytes)
/*
Algorithm:
Step 1: Start
Step 2: Ptrompt the user to enter the source file name
Step 3: Using file class object, open the text file
Step 4: Check whether the file is physically existing or not. if yes, then display appropriate file name. Display absolute path of the file, whether the file is writable or not and whether the file is readable or not
Step 5: Finally display the file size in bytes
Step 6: Stop
*/


import java.io.File;
class Fetch_Info
{
    public static void main(String args[])
    {
        File obj=new File("abc.txt");
        if(obj. exists())
        {
            System.out.println("File Name: "+obj.getName());
            System.out.println("Absolute Path: "+obj.getAbsolutePath());
            System.out.println("Readable: "+ obj.canRead());
            System.out.println("Writable: "+obj.canWrite());
            System.out.println("File Size in Bytes: "+obj.length());
        }
    }
}