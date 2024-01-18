package HW;

public class Reverse_number {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;

        // Reversing the number
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        
        System.out.println(rev);
    }

}
