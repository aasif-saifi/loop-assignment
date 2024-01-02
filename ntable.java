import java.util.Scanner;

public class ntable {
    
    // Q2. Write a Java program to print a multiplication table for a given number 'n'.

    public static void main(String[] args) {
        System.out.print("enter n number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(n*i);
        }
        
    }
}
