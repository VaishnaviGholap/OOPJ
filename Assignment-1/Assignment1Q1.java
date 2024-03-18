//Write a program that takes a numerical grade as input and outputs the corresponding letter
//grade using if-else statements.

import java.util.Scanner;

class Grade
 {
   public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Marks");
       int marks = sc.nextInt();

           if((marks >= 90) && (marks <= 100))
             {
               System.out.println("A");
             }
               else if((marks >= 80) && (marks < 90))
             {
               System.out.println("B");
             }
               else if((marks >= 60) && (marks < 80))
             {
               System.out.println("C");
             }
               else if((marks >= 40) && (marks < 60))
             {
               System.out.println("D");
             }
               else if((marks >= 30) && (marks < 40))
             {
               System.out.println("E");
             }
               else
             {
                System.out.println("F");
             }
     }
  }