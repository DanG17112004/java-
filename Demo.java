import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String username, pass;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a user name:");
        username = sc.nextLine(); 
        
        System.out.println("Enter the password for your account:");
        pass = sc.nextLine(); 

        System.out.println("Enter the user name for login purpose: ");
        String loginUsername = sc.nextLine(); 

        System.out.println("Enter the password for login purpose: ");
        String loginPass = sc.nextLine(); 

        if(username.equals(loginUsername)) { 
            System.out.println("Login successful!");
        }
        else {
                System.out.println("Login failed. Username does not match.");
            }
        

        if (pass.equals(loginPass)){
                System.out.println("Login sucessfull");
        }
        else {
                    System.out.println("Login failed. Password does not match.");
                }
        
    }
        
    }
