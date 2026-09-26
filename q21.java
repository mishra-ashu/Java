
import java.util.*;
class Person
{
    private  int age;
    private  float weight,height;
    private  String dateOfbirth,address;
    public void getdetails(int age,float weight,float height,String dateOfbirth,String address)
    {
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.dateOfbirth=dateOfbirth;
        this.address=address;
    }
     public void showdetails()
    {
        System.out.println("Age: " + age);
       System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("DOB: " + dateOfbirth);
        System.out.println("Address: " + address);
    }
}
class Employee extends Person
{
    private int salary;
    private String dateOfJoining;
    private int experience;
    public void employeedetails(int salary,String dateOfJoining,int experience)
    {
        this.salary=salary;
        this.dateOfJoining=dateOfJoining;
        this.experience=experience;
    }
    public void displayemployedetails()
   {
       showdetails();
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Experience: " + experience + " years");

   }
}
class Technician extends Employee
{
    public void displayTechnician()
     {
        System.out.println("\n--- Technician Details ---");
        displayemployedetails();
     }

}
class Professor extends Employee
{
    private List<String> courses = new ArrayList<>();
    private List<String> advisees = new ArrayList<>();

    public void addCourse(String course)
     {
        courses.add(course);
    }

    public void removeCourse(String course)
     {
        courses.remove(course);
    }

    public void addAdvisee(String student) 
    {
        advisees.add(student);
    }

    public void removeAdvisee(String student)
     {
        advisees.remove(student);
    }
    public void displayProfessor()
     {
        System.out.println("\n--- Professor Details ---");
        showdetails();

        System.out.println("Courses: " + courses);
        System.out.println("Advisees: " + advisees);
    }
}
class Student  extends Person
{
   private int roll;
   public  final List<String> subjects=new ArrayList<>();
   public final List<Integer> marks = new ArrayList<>();
       
   public void setStudentDetails(int roll)
    {
        this.roll = roll;
    }

    public void addSubject(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);
    }
    public char calculateGrade() 
    {
        int sum = 0;
        for (int m:marks) 
            sum += m;
        double avg = (double) sum / marks.size();

        if (avg >= 90) 
            return 'A';
        else if (avg >= 75)
             return 'B';
        else if (avg >= 50)
             return 'C';
        else return 'F';
    }
    public void displayStudent() 
    {
        System.out.println("\n--- Student Details ---");
        showdetails();
        System.out.println("Roll: " + roll);

        System.out.println("Subjects & Marks:");
        for (int i = 0; i < subjects.size(); i++) 
            {
            System.out.println(subjects.get(i) + ": " + marks.get(i));
           }

        System.out.println("Grade: " + calculateGrade());
    }
}
public class q21{


    public static void main(String[] args)
    {
     Technician t = new Technician();
        t.getdetails(19,70,5 ,"06:10:2006","howrah");
        t.employeedetails(40000,"23:06:2020",4);
        t.displayTechnician(); 

       Professor p = new Professor();
        p.getdetails(45, 80, 5, "15-08-1980", "Delhi");
        p.employeedetails(90000, "01-07-2010", 15);
        p.addCourse("DSA");
        p.addCourse("DBMS");
        p.addAdvisee("Student1");
        p.addAdvisee("Student2");
        p.displayProfessor(); 
        
        Student s = new Student();
        s.getdetails(20, 60, 6, "12-03-2005", "Mumbai");
        s.setStudentDetails(101);
        s.addSubject("Math", 85);
        s.addSubject("Physics", 78);
        s.addSubject("CS", 92);
        s.displayStudent();
    }
}