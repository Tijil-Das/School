/*While typing, a typist has created two or more consecutive blank spaces between the words of a sentence. Write a program in Java to eliminate multiple blanks between the words by a single blank.

Sample Input:
Indian   Cricket   team   tour   to   Australia

Sample Output:
Indian Cricket team tour to Australia

*/

/*
Algorithm:
Step 1: Start
Step 2: Accept input from the user
Step 3: Use StringTokenizer to split the string into multiple words, ignoring multiple spaces	
Step 4: Concatenate each word with a single space to the resulted string
Step 5: Remove the trailing space at the end of the string
Step 6: Display the modified string
Step 7: Stop
*/

import java.util.*;
public class String_Multiple_Blanks
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(str);
        String newStr = ""; //Empty String
        
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            newStr += word + " ";
        }
        
        newStr = newStr.trim();
        
        System.out.println("Output String:");
        System.out.println(newStr);
    }
}

/*
Variable Description:
str - Input string from the user
newStr - Modified string with single spaces between words
word - Individual word extracted from the input string
*/