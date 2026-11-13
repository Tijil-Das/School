/*Write a java program to accept a string and display the number of times each word occurs from the entire string and the output should be sorted into ascending order, words, along with usage of words. You may assume that the entire text is in capital letters ad each word is followed by a blank space, except ther last one, which is followed by a fullstoptext.

Test your program for the given sample data and also some other random data:

SAMPLE DATA:

Input:
YOU ARE GOOD WHEN YOUR THOUGHTS ARE GOOD AND YOUR DEEDS ARE GOOD.

Output:
Words    Word Count
And    1
Are    3
Deeds    1
Good    3
Thoughts    1
When    1
You    1
Your    2
Input:



Input:
IF YOU FAIL TO PLAN YOU ARE PLANNING TO FAIL.

Output:
Words    Word Count
Are    1
Fail    2
If    1
Plan    1
Planning    1
To    2
You    2

*/


/*
Algorithm:
Step 1: Start
Step 2: Accept the input string from the user, trim it and convert it to uppercase
Step 3: Remove the full stop from the end of the string, only if it is present
Step 4: Use StringTokenizer class to break the string into individual words
Step 5: Store each word in a String[] array (display an error and stop if the number of words is 0 or more than 50)
Step 6: Sort the array in alphabetical order using the bubble sort algorithm
Step 7: Compare each word with the next one to count its occurrences, and print each distinct word with its count
Step 8: Stop
*/

import java.util.*;
public class String_WordFreq
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine().trim().toUpperCase();

        // Remove the full stop only if it is actually present
        if (str.endsWith("."))
            str = str.substring(0, str.length() - 1);

        StringTokenizer st = new StringTokenizer(str);
        int wordCount = st.countTokens();

        if (wordCount == 0) 
        {
            System.out.println("Invalid Input!");
            System.out.println("Please enter at least one word.");
            return;
        }

        if (wordCount > 50) 
        {
            System.out.println("Invalid Input!");
            System.out.println("Number of words should be upto 50 only.");
            return;
        }

        String strArr[] = new String[wordCount];
        for (int i = 0; i < wordCount; i++) 
            strArr[i] = st.nextToken();

        // Bubble sort (ascending alphabetical order)
        for (int i = 0; i < wordCount - 1; i++) 
        {
            for (int j = 0; j < wordCount - i - 1; j++) 
            {
                if (strArr[j].compareTo(strArr[j + 1]) > 0) 
                {
                    String t = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = t;
                }
            }
        }

        System.out.println();
        System.out.println("Words\t\tWord Count");

        int count = 0;
        for (int i = 0; i < wordCount - 1; i++) 
        {
            count++;
            if (!strArr[i].equals(strArr[i + 1])) 
            {
                System.out.println(strArr[i] + "\t\t" + count);
                count = 0;
            }
        }

        // Print the last word of the array
        count++;
        System.out.println(strArr[wordCount - 1] + "\t\t" + count);
    }
}   

/*
Variable Description:
str: String variable to store the input string
strArr: String array to store the individual words from the input string    
wordCount: Integer variable to store the number of words in the input string
count: Integer variable to count the occurrences of each word
t: Temporary String variable used for swapping during sorting
i, j: Loop control variables
*/