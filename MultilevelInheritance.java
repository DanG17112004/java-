import java.util.Scanner;

class Vehicle {
  String model;
  int year;
}
class Car extends Vehicle {
  int Doors;
}
class ElectricCar extends Car {
  String batteryCapacity;
  void display() {
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("No of doors: " + Doors);
    System.out.println("Battery Capacity: " + batteryCapacity);
  }}
public class MultilevelInheritance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ElectricCar ec = new ElectricCar();
    
    System.out.println("Enter the car model: ");
    ec.model = sc.next(); 
    System.out.println("Enter the year: ");
    ec.year = sc.nextInt();
    System.out.println("Enter the no of doors: ");
    ec.Doors = sc.nextInt();    
    System.out.println("Enter the battery capacity of the car: ");
    ec.batteryCapacity = sc.next();  
    System.out.println("The car details:");
    ec.display();
  }
}