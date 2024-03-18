//Write a program that performs arithmetic operations involving different data types (int, double, float)
//and observes how Java handles widening conversions automatically.

class Conversion
{
   public static void main(String Args[])
{
   int num1 = 10;
   float num2 = 12.1f;
   double num3 = 5.1;

  double res1 = num1 + num2;
  float res2 = num2 - (float) num3;
  int res3 = num1 * (int) num3;
  double res4 = num2 / num1;
   

   System.out.println("num1 :   " + num1);
   System.out.println("num2 :   " + num2);
   System.out.println("num3 :   " + num3);
   System.out.println("res1 :   " + res1);
   System.out.println("res2 :   " + res2);  
   System.out.println("res3 :   " + res3);
   System.out.println("res4 :   " + res4);
}
}