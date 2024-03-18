//Write a Vehicle class with overloaded methods that have a different number of parameters.
//Demonstrate calling these overloaded methods with various numbers of arguments.

import java.util.Scanner;

class Vehicle
{
 public void Vehicle()
  {
    System.out.println("Speed of car");
  }

  public void Vehicle(int speed)
   {
   System.out.println("Speed of car is "+speed);
   }
  
 public void Vehicle(String model,int speed)
  {
  System.out.println("Speed of car is "+speed+ "Driven by"+model);
  }
}

class Main
{
 public static void main(String Args[])
{
  Vehicle car = new Vehicle();
  
 car.Vehicle();
 car.Vehicle(80);
 car.Vehicle("Veerna",120);
}
} 