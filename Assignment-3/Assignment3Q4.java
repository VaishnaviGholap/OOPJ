//Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and
//prints the result

class Conversion
{
   public static void main(String Args[])
{
   int num1 = 10;
   double num2 = (double) num1;
   float num3 = (float) num1;
  boolean num4 = num1 != 0;
   String str1 =  Integer.toString(num1);
   

   System.out.println("num1 :   " + num1);
   System.out.println("num2 :   " + num2);
   System.out.println("num3 :   " + num3);
  System.out.println("num4 :   " + num4);
   System.out.println("num5 :   " + str1);
}
}