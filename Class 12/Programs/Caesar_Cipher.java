/*Question:
Caesar Cipher is an encryption technique which is implemented as ROT13(‘rotate by 13 places’). It is a simple letter substitution cipher that places a letter with the letter 13 places after it in the alphabets, with the other characters remaining unchanged. Write a program to accept plain text of length L, where L must be greater than 3 and less than 100. Encrypt the text if valid as per the Caesar Cipher.
 */

/*
Algorithm:
Step 1: Start.
Step 2: Accept the string from the user.
Step 3: Check the length of the string, if the condition is not satisfied, display an appropriate message.
Step 4: Extract each letter and also check whether it is an alphabet or not. Increase the value by 13.
Step 5: If it is an alphabet, then check whether it is in uppercase or lowercase. If it is outside the range of lowercase and uppercase letter, then decrease the letter’s ASCII value by 26.
Step 6: Display the caesar cipher text.
Step 7: Stop.
*/

import java.util.*;
class Caesar_Cipher
{
    void rot13(String w)
    {
        char ch;
        int a = 0;
        String ans = "";
        for(int i = 0; i<w.length(); i++)
        {
            ch = w.charAt(i);
            if(Character.isLetter(ch))
            {
                a = ch + 13;
                if((Character.isUpperCase(ch) && a>90) || (Character.isLowerCase(ch) && a>122))
                {
                    a = a - 26;
                }
                ch = (char)a;
            }
            ans = ans + ch;
        }
        System.out.println("Output: The cipher text is :" +ans);
    }

    public static void main(String args[])
    {
        Caesar_Cipher ob = new Caesar_Cipher();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int L = s.length();
        if(L<3 || L>100)
        {
            System.out.println("Invalid Length");
        }
        else
        {
            ob.rot13(s);
        }
    }
}

/*
Variable Description:
w - the input string to be encrypted
ch - the current character being processed
a - the ASCII value of the encrypted character
ans - the resulting encrypted string
s - the input string from the user
i - Loop control variable
*/