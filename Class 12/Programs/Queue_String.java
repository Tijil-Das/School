import java.util.*;
class Queue_String
{
    String arr[];      
    int front;      
    int rear;       
    int limit;      

    //Constructor
    Queue_String(int size)
    {
        front = -1;
        rear  = -1;
        limit = size;
        arr   = new String[size];
    }

    //Returns true if the queue has no room left.
    boolean isFull()
    {
        return (rear == limit - 1);
    }

    //Returns true if the queue contains no elements.
    boolean isEmpty()
    {
        return (front == -1 || front > rear);
    }
    
    //Inserts a new word at the rear of the queue.
    void enqueue(String word)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] Queue is full - cannot insert \"" + word + "\".");
        else
        {
            rear++;
            arr[rear] = word;
            if (rear == 0)
                front = 0;
            System.out.println("  [SUCCESS] \"" + word + "\" inserted into the queue.");
        }
    }

    //Removes and returns the front-most word. Returns null if the queue is empty.
    String dequeue()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] Queue is empty - nothing to delete.");
            return null;
        }
        else
        {
            String word = arr[front];
            front++;
            if (front > rear)// reset the queue once it becomes empty
            {
                front = -1;
                rear  = -1;
            }
            return word;
        }
    }
    
    //Displays all elements currently in the queue, from front to rear, as boxes.
    void display()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [INFO] Queue is empty.");
            return;
        }

        System.out.print("  FRONT -> ");
        for (int i = front; i <= rear; i++)
        {
            System.out.print("[ " + arr[i] + " ]");
            if (i != rear)
                System.out.print(" - ");
        }
        System.out.println(" <- REAR");
    }
    
    //Displays the main menu.
    static void printMenu()
    {
        System.out.println();
        System.out.println("  +--------------------------------+");
        System.out.println("  |        QUEUE OPERATIONS        |");
        System.out.println("  +--------------------------------+");
        System.out.println("  |  1. Enqueue                    |");
        System.out.println("  |  2. Dequeue                    |");
        System.out.println("  |  3. Display                    |");
        System.out.println("  |  4. Exit                       |");
        System.out.println("  +--------------------------------+");
        System.out.print  ("  Enter your choice (1-4): ");
    }
    
    //Driver method - takes the queue size, then runs a menu-driven loop until the user chooses to exit.
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the maximum size of the queue: ");
        int size = sc.nextInt();
        sc.nextLine();
        Queue_String obj = new Queue_String(size);
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
                    System.out.print("  Enter the word to insert: ");
                    word = sc.nextLine();
                    obj.enqueue(word);
                    break;

                case 2:
                    word = obj.dequeue();
                    if (word != null)
                        System.out.println("  [SUCCESS] \"" + word + "\" deleted.");
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
- arr: An array of strings that holds the elements of the queue.
- front: An integer that keeps track of the index of the front element in the queue.
- rear: An integer that keeps track of the index of the rear element in the queue.
- limit: An integer that defines the maximum size of the queue.
- option: An integer that stores the user's menu choice.
- word: A string that temporarily holds the word to be inserted or deleted from the queue.
- size: An integer that stores the maximum size of the queue as input by the user.
- continueChoice: A string that stores the user's choice to continue or exit the program.
- i: Loop control variable
*/