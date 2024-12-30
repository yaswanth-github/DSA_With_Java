package HW;
import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Length: ");
        int n = scan.nextInt();

        int[] fib = new int[n];

        System.out.println("Enter first two numbers: ");
        fib[0] = scan.nextInt();
        fib[1] = scan.nextInt();

        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(fib[i] + " ");
        }

        scan.close();
    }
}
