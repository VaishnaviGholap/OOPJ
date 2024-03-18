//Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
//input and performs the operation using switch-case.

import java.util.Scanner;
 
class Cal
{
   public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num1");
       int num1 = sc.nextInt();
       System.out.println("Enter num2");
       int num2 = sc.nextInt();
       
       System.out.println("Select Operation");
       System.out.printf("1.Add \n 2.Sub \n 3.Mul \n 4.Div");
       int ch = sc.nextInt();

      switch(ch)
        {
          case 1:
            System.out.print("Add is "+(num1 + num2));
            break;

          case 2:
            System.out.print("Sub is "+(num1 - num2));
            break;

          case 3:
            System.out.print("Mul is "+(num1 * num2));
            break;

          case 4:
            System.out.print("Div is "+(num1 / num2));
            break;

            
        }

     
     }
}