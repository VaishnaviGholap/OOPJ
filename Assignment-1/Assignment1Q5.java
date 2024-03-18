/*Implement a program that calculates the Body Mass Index (BMI) based on height and weight
input using if-else to classify the BMI int categories (underweight, normal weight, overweight,
etc*/

import java.util.Scanner;
 
class Bmi
{
   public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Height");
       double ht = sc.nextDouble();
       System.out.println("Enter Weignt");
       double wt = sc.nextDouble();

       double x = wt/(ht*ht);

       if(x < 18.5)
        {
          System.out.println("Underweight");
        }
          else if(x >= 18.5 && x < 25)
        {
          System.out.println("Normal");
        }
          else if(x >= 25 && x < 30)
        {
          System.out.println("Overweight");
        }
         else
        {
         System.out.println("Obesity");
        }
     }
}


      



