import java.util.Scanner;
class Stack_Num
{
    int arr[];      
    int top;        
    int limit;      

    //Constructor
    Stack_Num(int size)
    {
        top   = -1;
        limit = size;
        arr   = new int[size];
    }

    //Check if stack is full
    boolean isFull()
    {
        return (top >= limit - 1);
    }

    //Check if stack is empty
    boolean isEmpty()
    {
        return (top == -1);
    }   

    //Insert a new element onto the top of the stack.
    void push(int element)
    {
        if (isFull())
        {
            System.out.println();
            System.out.println("  [ERROR] Stack Overflow - cannot push " + element + ".");
        }
        else
        {
            top++;
            arr[top] = element;
            System.out.println();
            System.out.println("  [SUCCESS] " + element + " pushed onto the stack.");
        }
    }

    
    //Removes and returns the top-most element. Returns -1 if the stack is empty.
    int pop()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] Stack Underflow - nothing to pop.");
            return -1;
        }
        else
        {
            int element = arr[top];
            top--;
            return element;   // no print here anymore
        }
    }

    //Displays the top-most element without removing it.
    int peek()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [INFO] Stack is empty - no top element.");
            return -1;
        }
    else
        return arr[top];   // no print here anymore
    }

    
    //Display all elements currently in the stack,
    void print()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [INFO] Stack is empty.");
            return;
        }
        
        System.out.println("Current Stack (top to bottom):");
        for (int i = top; i >= 0; i--)
        {
            if (i == top)
                System.out.println("  [ " + arr[i] + " ] <- TOP");
            else
                System.out.println("  [ " + arr[i] + " ]");
        }
    }
    
    //Display the main menu.
    static void printMenu()
    {
        System.out.println();
        System.out.println("  +--------------------------------+");
        System.out.println("  |        STACK OPERATIONS        |");
        System.out.println("  +--------------------------------+");
        System.out.println("  |  1. Push                       |");
        System.out.println("  |  2. Pop                        |");
        System.out.println("  |  3. Peek                       |");
        System.out.println("  |  4. Print                      |");
        System.out.println("  |  5. Exit                       |");
        System.out.println("  +--------------------------------+");
        System.out.print  ("  Enter your choice (1-5): ");
    }

    
    //Driver method - takes the stack size, then runs a menu-driven loop until the user chooses to exit.
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the maximum size of the stack: ");
        int size = sc.nextInt();

        Stack_Num obj = new Stack_Num(size);

        int  option, element;
        char ch;

        do
        {
            printMenu();
            option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("  Enter the element to push: ");
                    element = sc.nextInt();
                    obj.push(element);
                    break;

                case 2:
                    element = obj.pop();
                    if (element != -1)
                    {
                        System.out.println("  [SUCCESS] " + element + " popped.");
                    }
                    break;

                case 3:
                    element = obj.peek();
                    if (element != -1)
                        System.out.println("  [SUCCESS] Topmost element: " + element);
                    break;

                case 4:
                    obj.print();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("  [INFO] Program Terminated!");
                    break;

                default:
                    System.out.println();
                    System.out.println("  [ERROR] Invalid choice. Please select 1-5.");
            }

            if (option != 5)
            {
                System.out.print("\n  Continue? (y/n): ");
                ch = sc.next().charAt(0);
            }
            else
            {
                ch = 'n';
            }

        } while (ch == 'y' || ch == 'Y');

        System.out.println("=================================================");
        sc.close();
    }
}

/*
Variable Description:
- arr: Array to store stack elements
- top: Index of the top element in the stack
- limit: Maximum size of the stack
- ch: Variable to store user's choice to continue or exit
- element: Variable to store the element to be pushed or popped
- option: Variable to store the user's menu choice
- size: Variable to store the maximum size of the stack 
- i: Loop variable for iterating through the stack elements
*/