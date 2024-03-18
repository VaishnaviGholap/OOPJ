//Build a class Student which contains details about the Student and compile and run its
//instance.

import java.util.Scanner;

class Student
{
private String name;
private int rollno;
private int marks;
private char div;

public void acceptRecord()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Student Name");
 this.name = sc.nextLine();
 System.out.println("Enter Student Roll no.");
 this.rollno = sc.nextInt(); 
 System.out.println("Enter Student marks.");
 this.marks = sc.nextInt();
 System.out.println("Enter Student Div.");
 this.div = sc.next().charAt(0);
}

public void printRecord()
{
 System.out.println("Student Name: " +this.name);
 System.out.println("Student Roll No.: " +this.rollno);
 System.out.println("Enter Student Marks: " +this.marks);
 System.out.println("Enter Student Div: " +this.div);
}

}

class Program
{
  public static void main(String Args[])
   {
     Student stu = new Student();
     stu.acceptRecord();
     stu.printRecord();
   }
}