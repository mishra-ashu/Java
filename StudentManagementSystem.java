// import java.util.*;
// import java.util.ArrayList;
// class Student
//  {
//     int roll;
//     String name;
//     double marks;

//     Student(int roll, String name, double marks)
//      {
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }

//     void display()
//      {
//         System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
//     }
// }

// public class StudentManagementSystem 
// {

//     static Student[] students = new Student[100];
//     static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {

//         while (true) {
//             System.out.println("\n1. Add Student");
//             System.out.println("2. View Students");
//             System.out.println("3. Search Student");
//             System.out.println("4. Update Student");
//             System.out.println("5. Delete Student");
//             System.out.println("6. Exit");

//             System.out.print("Enter choice: ");
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1: addStudent(); break;
//                 case 2: viewStudents(); break;
//                 case 3: searchStudent(); break;
//                 case 4: updateStudent(); break;
//                 case 5: deleteStudent(); break;
//                 case 6: System.exit(0);
//                 default: System.out.println("Invalid choice!");
//             }
//         }
//     }

//     static void addStudent()
//      {
//         System.out.print("Enter Roll: ");
//         int roll = sc.nextInt();
//         sc.nextLine(); 

//         System.out.print("Enter Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Marks: ");
//         double marks = sc.nextDouble();

//         Student.add(new Student(roll, name, marks));
//         System.out.println("Student added successfully!");
//     }

//     static void viewStudents() {
//         if (Student.isEmpty()) {
//             System.out.println("No students found!");
//             return;
//         }
//         for (Student s : students) {
//             s.display();
//         }
//     }

//     static void searchStudent() {
//         System.out.print("Enter Roll to search: ");
//         int roll = sc.nextInt();

//         for (Student s : students) {
//             if (s.roll == roll) {
//                 s.display();
//                 return;
//             }
//         }
//         System.out.println("Student not found!");
//     }

//     static void updateStudent() {
//         System.out.print("Enter Roll to update: ");
//         int roll = sc.nextInt();
//         sc.nextLine();

//         for (Student s : students) {
//             if (s.roll == roll) {
//                 System.out.print("Enter new name: ");
//                 s.name = sc.nextLine();

//                 System.out.print("Enter new marks: ");
//                 s.marks = sc.nextDouble();

//                 System.out.println("Updated successfully!");
//                 return;
//             }
//         }
//         System.out.println("Student not found!");
//     }

//     static void deleteStudent() {
//         System.out.print("Enter Roll to delete: ");
//         int roll = sc.nextInt();

//         Iterator<Student> it = Student.iterator();
//         while (it.hasNext()) {
//             Student s = it.next();
//             if (s.roll == roll) {
//                 it.remove();
//                 System.out.println("Deleted successfully!");
//                 return;
//             }
//         }
//         System.out.println("Student not found!");
//     }
// }