//Write a program that checks if a given year is a leap year or not using both if-else and
//switch-case.

import java.util.Scanner;

class Leap
{
  public static void main(String Args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Year");
      int year = sc.nextInt();
       
      if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
          System.out.println(year+" is Leap");
        }
      else
        {
           System.out.println(year+" is Non-Leap");
        }
    }
}