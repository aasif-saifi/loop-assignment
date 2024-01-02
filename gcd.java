import java.util.Scanner;
public class gcd {

    // Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int n1 = sc.nextInt();
          System.out.print("enter second number:");
        int n2 = sc.nextInt();
        for (int i = 1; i <=(n1&n2); i++) {
            if (n1%i==0 && n2%i==0) {
                System.out.println(i+" is gcd of n1 and n2");  
        }
    }
    
}
}