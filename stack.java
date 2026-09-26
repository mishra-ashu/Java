import java.util.*;

class Stack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;

     Stack(int size) 
     {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw an exception
        }
    }

    int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // or throw an exception
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        int n;
        System.out.println("enter the sixe of statck is requried:");
        n=sc.nextInt();
        Stack stack = new Stack(n);
        do
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int peekedValue = stack.peek();
                    if (peekedValue != -1) {
                        System.out.println("Top value: " + peekedValue);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(ch!=4);


   }
}
