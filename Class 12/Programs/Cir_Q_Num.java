import java.util.*;
class Cir_Q_Num
{
    int arr[];
    int front;
    int rear;
    int limit;

    //Constructor
    Cir_Q_Num(int size)
    {
        front = -1;
        rear  = -1;
        limit = size;
        arr   = new int[size];
    }

    //Returns true if the queue has no space left.
    boolean isFull()
    {
        if (front == 0 && rear == limit - 1)
            return true;
        if (front == rear + 1)
            return true;
        return false;
    }

    //Returns true if the queue contains no elements.
    boolean isEmpty()
    {
        return (front == -1);
    }

    //Inserts a new element at the rear of the queue.
    void enqueue(int element)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] Queue is full - cannot insert " + element + ".");
        else
        {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % limit;
            arr[rear] = element;
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
            if (front == rear)     // only one element was present
            {
                front = -1;
                rear  = -1;
            }
            else
                front = (front + 1) % limit;
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

        System.out.println("  Position of Front: " + front);
        System.out.print("  FRONT -> ");
        int i;
        for (i = front; i != rear; i = (i + 1) % limit)
            System.out.print("[ " + arr[i] + " ] - ");
        System.out.println("[ " + arr[i] + " ] <- REAR");
        System.out.println("  Position of Rear:  " + rear);
    }

    //Displays the main menu.
    static void printMenu()
    {
        System.out.println();
        System.out.println("  +--------------------------------+");
        System.out.println("  |    CIRCULAR QUEUE OPERATIONS   |");
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
        System.out.print("\nEnter the maximum size of the circular queue: ");
        int size = sc.nextInt();
        Cir_Q_Num obj = new Cir_Q_Num(size);
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
- arr: Array to store circular queue elements   
- front: Index of the front element in the queue
- rear: Index of the rear element in the queue
- limit: Capacity (maximum number of elements) of the queue
-  ch: Variable to store user's choice to continue or exit
-  element: Variable to store the element to be inserted or deleted
- option: Variable to store the user's menu choice
- size: Size of the queue entered by the user during object creation
- i: Loop variable for iterating through the queue elements
*/