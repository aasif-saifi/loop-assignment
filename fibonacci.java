import java.util.Scanner;

public class fibonacci {

    // Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

    public static void main(String[] args) {
        System.out.print("enter n number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0,n2=1,n3;
        
            System.out.print(n1+" "+n2);

            for (int i = 3; i <= n; i++) {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
                
            }
        //     int i=3;
        //     while (i<=n) {
        //     int n3=n1+n2;
        //     System.out.print(" "+n3);
        //     n1=n2;
        //     n2=n3;
        //     i++;
        // }
    
}
}