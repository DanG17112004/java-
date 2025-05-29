import java.util.Scanner;
class Employees{
  String name;
  String ID;
  void display(){
      System.out.println("Name: "+name+"\nID: "+ID);
  }
  }
class PartTime extends Employees{
  float salary;
  void salary(){
      System.out.println("Salary: "+salary);
  }
  }
class FullTime extends Employees{
  float salary;
  void salary(){
       System.out.println("Salary: "+salary);
  }
  }
public class HierarchicalInheritance{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      PartTime pt=new PartTime();
      FullTime ft=new FullTime();
      System.out.println("Part-time Employee details");
      System.out.print("Enter the name of the empolyee:");
      pt.name=sc.nextLine();
      System.out.print("Enter the employee id:");
      pt.ID=sc.next();
      System.out.print("Enter the Salary:");
      pt.salary=sc.nextFloat();
      System.out.println("Full-time Employee details");
      sc.nextLine();
      System.out.print("Enter the name of the empolyee:");
      ft.name=sc.nextLine();
      System.out.print("Enter the employee id:");
      ft.ID=sc.next();
      System.out.print("Enter the Salary:");
      ft.salary=sc.nextFloat();
      System.out.println("FULL TIME EMPLOYEE:");
      pt.display();
      pt.salary();
      System.out.println("PART TIME EMPLOYEE:");
      ft.display();
      ft.salary();
  }
  }
