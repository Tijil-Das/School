import java.util.*;
class DEque
{
    int arr[];      
    int front;      
    int rear;       
    int limit;      
    int size;       

    //Constructor
    DEque(int limit)
    {
        arr   = new int[limit];
        front = 0;
        rear  = -1;
        size  = 0;
    }

    //Returns true if the deque has no room left.
    boolean isFull()
    {
        return (size == limit);
    }

    //Returns true if the deque contains no elements.
    boolean isEmpty()
    {
        return (size == 0);
    }

    //Inserts a new element at the front of the deque.
    void enqueueFront(int element)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] DEque is full - cannot insert " + element + " at front.");
        else
        {
            front = (front == 0) ? limit - 1 : front - 1;
            arr[front] = element;
            size++;
            System.out.println("  [SUCCESS] " + element + " inserted at front.");
        }
    }

    //Inserts a new element at the rear of the deque.
    void enqueueRear(int element)
    {
        System.out.println();
        if (isFull())
            System.out.println("  [ERROR] DEque is full - cannot insert " + element + " at rear.");
        else
        {
            rear = (rear == limit - 1) ? 0 : rear + 1;
            arr[rear] = element;
            size++;
            System.out.println("  [SUCCESS] " + element + " inserted at rear.");
        }
    }

    //Removes and returns the front-most element. Returns -1 if the deque is empty.
    int dequeueFront()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] DEque is empty - nothing to delete.");
            return -1;
        }
        else
        {
            int item = arr[front];
            front = (front == limit - 1) ? 0 : front + 1;
            size--;
            return item;
        }
    }

    //Removes and returns the rear-most element. Returns -1 if the deque is empty.
    int dequeueRear()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [ERROR] DEque is empty - nothing to delete.");
            return -1;
        }
        else
        {
            int item = arr[rear];
            rear = (rear == 0) ? limit - 1 : rear - 1;
            size--;
            return item;
        }
    }

    //Displays all elements currently in the deque, from front to rear, as boxes.
    void display()
    {
        System.out.println();
        if (isEmpty())
        {
            System.out.println("  [INFO] DEque is empty.");
            return;
        }

        System.out.print("  FRONT -> ");
        int i = front;
        for (int count = 0; count < size; count++)
        {
            System.out.print("[ " + arr[i] + " ]");
            if (count != size - 1)
                System.out.print(" - ");
            i = (i == limit - 1) ? 0 : i + 1;
        }
        System.out.println(" <- REAR");
    }

    //Displays the main menu.
    static void printMenu()
    {
        System.out.println();
        System.out.println("  +--------------------------------+");
        System.out.println("  |        DEque OPERATIONS        |");
        System.out.println("  +--------------------------------+");
        System.out.println("  |  1. Enqueue Front              |");
        System.out.println("  |  2. Enqueue Rear               |");
        System.out.println("  |  3. Dequeue Front              |");
        System.out.println("  |  4. Dequeue Rear               |");
        System.out.println("  |  5. Display                    |");
        System.out.println("  |  6. Exit                       |");
        System.out.println("  +--------------------------------+");
        System.out.print  ("  Enter your choice (1-6): ");
    }

    //Driver method - takes the deque limit, then runs a menu-driven loop until the user chooses to exit.
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the maximum size of the DEque: ");
        int cap = sc.nextInt();
        DEque obj = new DEque(cap);
        int  option, element;
        char ch;
        do
        {
            printMenu();
            option = sc.nextInt();
            switch (option)
            {
                case 1:
                    System.out.print("  Enter the element to insert at front: ");
                    element = sc.nextInt();
                    obj.enqueueFront(element);
                    break;

                case 2:
                    System.out.print("  Enter the element to insert at rear: ");
                    element = sc.nextInt();
                    obj.enqueueRear(element);
                    break;

                case 3:
                    element = obj.dequeueFront();
                    if (element != -1)
                        System.out.println("  [SUCCESS] " + element + " deleted from front.");
                    break;

                case 4:
                    element = obj.dequeueRear();
                    if (element != -1)
                        System.out.println("  [SUCCESS] " + element + " deleted from rear.");
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("  Program Terminated!");
                    break;

                default:
                    System.out.println();
                    System.out.println("  [ERROR] Invalid choice. Please select 1-6.");
            }

            if (option != 6)
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
- arr: An array to store the elements of the deque.
- front: An integer to track the index of the front element in the deque.
- rear: An integer to track the index of the rear element in the deque.
- limit: An integer to define the maximum capacity of the deque.
- size: An integer to track the current number of elements in the deque.
- option: An integer to store the user's menu choice.
- element: An integer to store the element to be inserted or deleted from the deque.
- ch: A character to determine if the user wants to continue or exit the program.
- i: An integer used as an index for iterating through the deque elements during display.
*/