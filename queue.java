import java.util.Scanner;

class Queue 
{ 
    int front, rear, size; 
    int capacity; 
    int array[]; 

    Queue(int capacity) 
    { 
        this.capacity = capacity; 
        this.front = 0; 
        this.size = 0; 
        this.rear = -1; 
        array = new int[capacity]; 
    } 

    void enqueue(int item) 
    { 
        if(size == capacity) 
        { 
            System.out.println("Queue overflow"); 
        } 
        else 
        { 
            rear = rear +1; 
            array[rear] = item; 
            size++; 
        } 
    } 

    int delete() 
    { 
        if(size == 0) 
        { 
            System.out.println("Queue underflow"); 
            return -999; 
        } 
        else 
        { 
            int deleted = array[front]; 
            front = front + 1; 
            size--; 
            return deleted; 
        } 
    } 

    void display() 
    { 
        if(size == 0) 
        { 
            System.out.println("Queue is empty"); 
        } 
        else 
        { 
            for(int i = 0; i < size; i++) 
            { 
                System.out.println(array[i]); 
            } 
        } 
    } 

    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        int ch; 

        System.out.println("Enter the size of queue:"); 
        int n = sc.nextInt(); 

        Queue q = new Queue(n); 

        do 
        { 
            System.out.println("1. enqueue"); 
            System.out.println("2. delete"); 
            System.out.println("3. display"); 
            System.out.println("4. exit"); 
            System.out.println("Enter your choice:"); 

            ch = sc.nextInt(); 

            switch(ch) 
            { 
                case 1: 
                    System.out.println("Enter item:"); 
                    int item = sc.nextInt(); 
                    q.enqueue(item); 
                    break; 

                case 2: 
                    int del = q.delete(); 
                    if(del != -999) 
                    { 
                        System.out.println("Deleted item is: " + del); 
                    } 
                    break; 

                case 3: 
                    q.display(); 
                    break; 

                case 4: 
                    System.exit(0); 

                default: 
                    System.out.println("Invalid choice"); 
            } 
        } while(ch != 4); 
    } 
}