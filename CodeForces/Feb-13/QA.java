import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n < 3 || n > 26 * 26 * 26) {
                throw new IllegalArgumentException("Invalid input: " + n);
            }
            String result = decode(n);
            System.out.println(result);
        }
        scanner.close();
    }

    public static String decode(int n) {
        if (n < 3 || n > 26 * 26 * 26) {
            throw new IllegalArgumentException("Invalid input: " + n);
        }
        int firstLetter = (n / (26 * 26)) ;
        int secondLetter = ((n / 26) % 26) ;
        int thirdLetter = (n % 26) -3;
        StringBuilder sb = new StringBuilder();
        sb.append((char) ('a' + firstLetter));
        sb.append((char) ('a' + secondLetter));
        sb.append((char) ('a' + thirdLetter));
        return sb.toString();
    }
}