package inhertance;

import java.util.*;

public class stock 
{
    String item;
    int qty;
    double rate;
    double amt;

    stock(String item1, int qty1, double rate1)
     {
        item = item1;
        qty = qty1;
        rate = rate1;

     }

    void display()
     {
        System.out.println(item);
        System.out.println(qty);
        System.out.println(rate);
     }
}

class purchace extends stock 
{
    int pqty;
    double prate;
    double amt1;

    purchace(String item2, int qty2, double rate2, int pqty1, double prate2)
     {
        super(item2, qty2, rate2);
        pqty = pqty1;
        prate = prate2;
    }

    void update() 
    {
        amt = qty * rate;
        qty = pqty;
        rate = prate;
        amt1 = qty * rate;
    }

    void display() 
    {
        super.display();
        System.out.println(amt);
        System.out.println(amt1);
    }

    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int  qty,pqty;
        double rate,prate;
        String item;
        System.out.println("enter all the data");
        item = sc.nextLine();
        qty = sc.nextInt();
        rate = sc.nextDouble();
        pqty = sc.nextInt();
        prate = sc.nextDouble();
        purchace obj = new purchace(item, qty, rate, pqty, prate);
        obj.update();
        obj.display();
    }
}
