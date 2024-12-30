package HW;
import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        int sum = 0;
        // Finding divisors of n and adding them
        for (int i = 1; i < n; ++i) {
            if (n % i == 0) {
                System.out.println("Divisor: " + i);
                sum += i;
            }
        }

        // Checking if sum of divisors is equal to n or not
        if (sum == n) {
            System.out.println(n + " Is a Perfect Number");
        } else {
            System.out.println(n + " Is Not a Perfect Number");
        }
        scan.close();
    }
}
