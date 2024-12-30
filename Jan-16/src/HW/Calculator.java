package HW;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scan.nextInt();
        System.out.println("Enter Operator: ");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        scan.close();
    }
}
