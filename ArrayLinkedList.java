class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ArrayLinkedList{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Node head = null;
        Node tail = null;

        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}