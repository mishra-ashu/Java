class Automobile
{
    protected int type ,maxspeed;
    protected float price,mileage;
    protected String registrationNumber,make;
    public void details(String make,int type,int maxspeed,float price,float mileage,String registrationnumber)
    {
        this.make=make;
        this.type=type;
        this.maxspeed=maxspeed;
        this.price=price;
        this.mileage=mileage;
        this.registrationNumber=registrationnumber;
    }
    public void showdetails()
    {
        System.out.println("make:"+make);
        System.out.println("type :"+type);
        System.out.println("maxspeed :"+maxspeed);
        System.out.println("price :"+price);
        System.out.println("mileage :"+mileage);
        System.out.println("registrationnumber :"+registrationNumber);

    }
}
class Track extends Automobile
{
    protected int capacity,hoodType,noOfWheels;
    public void trackdetails(int capacity,int hoodType,int noOfWheels)
    {
        this.capacity=capacity;
        this.hoodType=hoodType;
        this.noOfWheels=noOfWheels;
    }
    public void trackshow()
    {
        System.out.println("--------track details-------");
        showdetails();
        System.out.println("capacity"+capacity);
        System.out.println("hoodType"+hoodType);
        System.out.println("no of wheels :"+noOfWheels);
    }
    
}
class Car extends Automobile
{
    protected int noOfDoors,seatingCapacity;
    public void cardetails(int noOfDoors,int seatingCapacity)
    {
        this.noOfDoors=noOfDoors;
        this.seatingCapacity=seatingCapacity;
    }
    public void carshow()
    {
        System.out.println("--------Car details-------");
        showdetails();
        System.out.println("no of doors :"+noOfDoors);
        System.out.println("seating capacity:"+seatingCapacity);
    }

}
public class q22
{
 public static void main(String[] args) 
     {
       Track t=new Track();
      t.details("iron",1,180,450000,17,"wb20q2345");
      t.trackdetails(4,2,4);
      t.trackshow();

      Car c=new Car();
      c.details("iron",1,180,350000,21,"wb12hu7654");
      c.cardetails(5,4 );
     c.carshow();
     }
}