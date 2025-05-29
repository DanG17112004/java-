import java.util.Scanner;

public class OverloadExample {
    public int sum(int a, int b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }

    public int increment(int a) {
        return a + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OverloadExample obj = new OverloadExample();

        // Input two integers and calculate their sum
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
       
        scanner.nextLine(); 
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        // Input a single integer to increment
        System.out.print("Enter an integer to increment: ");
        int num = scanner.nextInt();

        int intResult = obj.sum(num1, num2);
        System.out.println("Sum of integers: " + intResult);

        String stringResult = obj.sum(str1, str2);
        System.out.println("Concatenated strings: " + stringResult);

        int incrementResult = obj.increment(num);
        System.out.println("Incremented value: " + incrementResult);

        // Close the scanner
    }
}
/*import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int len=str.length();
        int chars=0,digit=0,space=0,line=0,alphabet=0,word=0,spcl=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                alphabet++; 
            }
            else if(str.charAt(i)>='0'& str.charAt(i)<='9')
            {
                digit++; 
            }
            else if(str.charAt(i)=='\n')
            {
                line++; 
            }
            else if(str.charAt(i)==' ')
            { 
                space++; 
            }
            else
            { 
                spcl++; */oid main ;3
                tor while {
                    ping the commad 