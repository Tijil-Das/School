import java.util.*;
class Stack_String
{
    String arr[];
    int top;
    int limit;
    
    //Constructor
    Stack_String(int size)
    {
        top   = -1;
        limit = size;
        arr   = new String[size];
    }

    //Returns true if the stack has no space left.
    boolean isFull()
    {
        return (top == limit - 1);
    }

    //Returns true if the stack is empty.
    boolean isEmpty()
    {
        return (top == -1);
    }

    //Inserts a new word onto the top of the stack.
    void push(String word)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] Stack Overflow - cannot push \"" + word + "\".");
        else
        {
            top++;
            arr[top] = word;
            System.out.println("  [SUCCESS] \"" + word + "\" pushed onto the stack.");
        }
    }

   
    //Removes and returns the top-most word. Returns null if the stack is empty.
    String pop()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] Stack Underflow - nothing to pop.");
            return null;
        }
        else
        {
            String word = arr[top];
            top--;
            return word;
        }
    }

    //Displays all elements currently in the stack, from top to bottom, as stacked boxes.
    void display()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [INFO] Stack is empty.");
            return;
        }

        for (int i = top; i >= 0; i--)
        {
            if (i == top)
                System.out.println("  [ " + arr[i] + " ] <- TOP");
            else
                System.out.println("  [ " + arr[i] + " ]");
        }
    }

    //Displays the main menu.
    static void printMenu()
    {
        System.out.println();
        System.out.println("  +--------------------------------+");
        System.out.println("  |        STACK OPERATIONS        |");
        System.out.println("  +--------------------------------+");
        System.out.println("  |  1. Push                       |");
        System.out.println("  |  2. Pop                        |");
        System.out.println("  |  3. Display                    |");
        System.out.println("  |  4. Exit                       |");
        System.out.println("  +--------------------------------+");
        System.out.print  ("  Enter your choice (1-4): ");
    }

   
    //Driver method - takes the stack size, then runs a menu-driven loop until the user chooses to exit.    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the maximum size of the stack: ");
        int size = sc.nextInt();
        sc.nextLine();
        Stack_String obj = new Stack_String(size);
        int option;
        String word;
        String continueChoice;
        do
        {
            printMenu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.print("  Enter the word to push: ");
                    word = sc.nextLine();
                    obj.push(word);
                    break;

                case 2:
                    word = obj.pop();
                    if (word != null)
                        System.out.println("  [SUCCESS] \"" + word + "\" popped.");
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("  Program Terminated!");
                    break;

                default:
                    System.out.println();
                    System.out.println("  [ERROR] Invalid choice. Please select 1-4.");
            }

            if (option != 4)
            {
                System.out.print("\n  Continue? (y/n): ");
                continueChoice = sc.nextLine();
            }
            else
            {
                continueChoice = "n";
            }

        } while (continueChoice.equalsIgnoreCase("y"));
        System.out.println("=================================================");
    }
}

/*
Variable Description:
- arr: An array of strings that holds the elements of the stack.
- top: An integer that keeps track of the index of the top element in the stack.
- limit: An integer that defines the maximum size of the stack.
- continueChoice: A string that stores the user's choice to continue or exit the program.
- option: An integer that stores the user's menu choice.        
- word: A string that temporarily holds the word to be pushed or popped from the stack.
- size: An integer that stores the maximum size of the stack as input by the user.
- i: Loop control variable
*/