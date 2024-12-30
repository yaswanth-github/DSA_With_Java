package HW;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        
        int temp = n;
        int sum = 0;
        int digit = 0;

        // Finding number of digits
        while (temp != 0) {
            temp /= 10;
            ++digit;
        }

        temp = n;

        // Finding sum of cubes of digits
        while (temp != 0) {
            sum += Math.pow(temp % 10, digit);
            temp /= 10;
        }

        // Checking if sum is equal to n or not
        if (sum == n) {
            System.out.println(n + " Is an Armstrong Number");
        } else {
            System.out.println(n + " Is Not an Armstrong Number");
        }
        scan.close();
    }
}
