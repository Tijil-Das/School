import java.util.*;
class Queue_Num
{
    int arr[];      
    int front;      
    int rear;       
    int limit;      

    //Constructor
    Queue_Num(int size)
    {
        front = -1;
        rear  = -1;
        limit = size;
        arr   = new int[size];
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
    
    //Inserts a new element at the rear of the queue.
    void enqueue(int element)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] Queue is full - cannot insert " + element + ".");
        else
        {
            rear++;
            arr[rear] = element;
            if (rear == 0)
                front = 0;
            System.out.println("  [SUCCESS] " + element + " inserted into the queue.");
        }
    }

    //Removes and returns the front-most element. Returns -1 if the queue is empty.
    int dequeue()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] Queue is empty - nothing to delete.");
            return -1;
        }
        else
        {
            int element = arr[front];
            front++;
            if (front > rear)// reset the queue once it becomes empty
            {
                front = -1;
                rear  = -1;
            }
            return element;
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
        Queue_Num obj = new Queue_Num(size);
        int  option, element;
        char ch;
        do
        {
            printMenu();
            option = sc.nextInt();
            switch (option)
            {
                case 1:
                    System.out.print("  Enter the element to insert: ");
                    element = sc.nextInt();
                    obj.enqueue(element);
                    break;

                case 2:
                    element = obj.dequeue();
                    if (element != -1)
                        System.out.println("  [SUCCESS] " + element + " deleted.");
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
                ch = sc.next().charAt(0);
            }
            else
                ch = 'n';

        } while (ch == 'y' || ch == 'Y');
        System.out.println("=================================================");
        sc.close();
    }
}

/*
Variable Description:
- arr: An array to store the elements of the queue.
- front: An integer to track the index of the front element in the queue.
- rear: An integer to track the index of the rear element in the queue.
- limit: An integer to define the maximum size of the queue.
- size: The maximum size of the queue, provided by the user at runtime.
- option: An integer to store the user's menu choice.
- element: An integer to store the element to be inserted or deleted from the queue.
- ch: A character to determine if the user wants to continue or exit the program.
*/