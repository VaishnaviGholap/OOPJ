//Write a program that takes a number representing a weekday (1-7) and prints the name of the
//weekday using switch-case.

import java.util.Scanner;
 
class Week
{
   public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter day");
       int ch = sc.nextInt();
      
    
      switch(ch)
        {
          case 1:
            System.out.print("Sunday");
            break;

          case 2:
            System.out.print("Monday");
            break;

          case 3:
            System.out.print("Tuesday");
            break;

          case 4:
            System.out.print("Wednesday");
            break;

          case 5:
            System.out.print("Thursady");
            break;
          case 6:
            System.out.print("Friday");
            break;
          case 7:
            System.out.print("Saturday");
            break;
          default:
            System.out.print("Invalid");

            
        }



     }
}