class MyArrayList {
    private int[] arr;
    private int size;

    MyArrayList() {
        arr = new int[5];
        size = 0;
    }

    void add(int value) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];

            for(int i=0;i<arr.length;i++) {
                newArr[i] = arr[i];
            }

            arr=newArr;
        }

        arr[size]=value;
        size++;
    }

    int get(int index) {
        if (index < 0 || index >= size) 
            System.out.println("empty");      
        return arr[index];
    }

    void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("out of range");
        }

        for (int i =index;i<size-1;i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    int size() {
        return size;
    }

    void display() {
        for (int i =0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayList {
    public static void main(String[] args) {
        MyArrayList obj = new MyArrayList();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);

        System.out.println("ArrayList:");
        obj.display();

        System.out.println("Element at index 2: " + obj.get(2));

        obj.remove(1);

        System.out.println("After removing index 1:");
        obj.display();

        System.out.println("Size: " + obj.size());
    }
}