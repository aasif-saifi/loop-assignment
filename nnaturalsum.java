import java.util.Scanner;

public class nnaturalsum {

    // Write a Java program to calculate the sum of natural numbers up to a given
    // positive integer 'n'.

    public static void main(String[] args) {
        System.out.print("enter n number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of n natural number is:"+sum);
    }
}