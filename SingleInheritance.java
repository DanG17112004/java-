import java.util.Scanner;
class Employee
{
    String Name;
    String EmpId;
    void displayEmployee()
    {
        System.out.println("Name: " + Name + "\n ID: " + EmpId);
    }
    }
class Manager extends Employee {
    String Department;
    void Manage() {
        System.out.print("Department: " + Department);
    }
    }
public class SingleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        Manager m = new Manager();
        System.out.println("Employee details");
        System.out.print("Enter the name of the employee: ");
        e.Name = sc.nextLine();
        System.out.print("Enter the employee id: ");
        e.EmpId = sc.nextLine();
        
        System.out.println("Manager details");
        System.out.print("Enter the name of the manager: ");
        m.Name = sc.nextLine();
        System.out.print("Enter the manager id: ");
        m.EmpId = sc.nextLine(); 
        System.out.print("Enter the department: ");
        m.Department = sc.nextLine(); 
        System.out.println("EMPLOYEE DETAILS");
        e.displayEmployee();
        System.out.println("MANAGER DETAILS");
        m.displayEmployee();
        System.out.println("Department: " + m.Department); 
    }
    }