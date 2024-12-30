package HW;
import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        int temp = n;
        int rev = 0;
        // Reversing the number
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        // Checking if rev is equal to n or not
        if (rev == n) {
            System.out.println(n + " Is a Palindrome Number");
        } else {
            System.out.println(n + " Is Not a Palindrome Number");
        }
        scan.close();
    }

}
