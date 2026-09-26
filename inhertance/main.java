package inhertance;

import java.util.*;
class Stock {
    String item;
    int qty;
    double rate;
    double amt;

    Stock(String item1, int qty1, double rate1) {
        item = item1;
        qty = qty1;
        rate = rate1;
    }

    void display() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Rate: " + rate);
    }
}

class Purchase extends Stock {
    int pqty;
    double prate;
    double amt1;

    Purchase(String item2, int qty2, double rate2,
             int pqty1, double prate2) {

        super(item2, qty2, rate2);

        pqty = pqty1;
        prate = prate2;
    }

    void update() {
        amt = qty * rate;

        qty = qty + pqty;   // updating stock quantity
        rate = prate;

        amt1 = qty * rate;
    }

    void display() {
        super.display();

        System.out.println("Old Amount: " + amt);
        System.out.println("Updated Amount: " + amt1);
    }
}

public class main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String item;
        int qty, pqty;
        double rate, prate;

        System.out.println("Enter item name:");
        item = sc.nextLine();

        System.out.println("Enter quantity:");
        qty = sc.nextInt();

        System.out.println("Enter rate:");
        rate = sc.nextDouble();

        System.out.println("Enter purchase quantity:");
        pqty = sc.nextInt();

        System.out.println("Enter purchase rate:");
        prate = sc.nextDouble();

        Purchase obj = new Purchase(item, qty, rate, pqty, prate);

        obj.update();
        obj.display();

        sc.close();
    }
}