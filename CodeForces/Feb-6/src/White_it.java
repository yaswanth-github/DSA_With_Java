import java.util.Scanner;

public class White_it {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            while (testCases-- > 0) {
                int length = scanner.nextInt();
                String sequence = scanner.next();
                System.out.println(findWidth(length, sequence));
            }
        }
    }

    public static int findWidth(int length, String sequence) {
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            if (sequence.charAt(left) == 'W') {
                left++;
            }
            if (sequence.charAt(right) == 'W') {
                right--;
            }

            if (sequence.charAt(left) == 'B' && sequence.charAt(right) == 'B') {
                break;
            }
        }
        return right - left + 1;
    }
}