//Create a class Employee with multiple overloaded methods that have different parameter types (e.gint, double, String). 
//Demonstrate calling each overloaded method with appropriate arguments.

class Employee
{

        public void calcSalary(int Salary)
       {
        int totalSal = Salary + 5000; 
        System.out.println("Total salary " + totalSal);
       }
     
       public void calSalary(double Salary)
       {
        double totalSal = Salary + 5000.45; 
        System.out.println("Total salary " + totalSal);
       }

        public void calSalary(String Salary)
       {
        double sal = Double.parseDouble(Salary);
        double totalSal = sal + 5000.45; 
        System.out.println("Total salary " + totalSal);
       }

      

}

class main
{
public static void main(String Args[])
  {
   Employee emp = new Employee();
   emp.calSalary(8000);
   emp.calSalary(8000.32);
   emp.calSalary(5000.68);

  }
}