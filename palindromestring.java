import java.util.Scanner;

public class palindromestring {
    
    // Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

    public static void main(String[] args) {
        System.out.print("enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse="";
        for (int i =(str.length() - 1);i>=0; i--) {
            reverse=reverse+str.charAt(i);
        }
            if(str.toLowerCase().equals(reverse.toLowerCase())){
                System.out.println(str+" is palindrome string");
            } else
            System.out.println(str+" is not palindrome string");

            
        
    }
}
