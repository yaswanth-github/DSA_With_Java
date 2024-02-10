import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class QE {

    public static ArrayList<Integer> generatePermutation(int n, int k) {
        Random random = new Random();

        // Start with a shuffled sequence of numbers from 1 to n
        ArrayList<Integer> permutation = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            permutation.add(i);
        }
        Collections.shuffle(permutation, random);

        // Maintain a sliding window of size k and adjust values to achieve k-level property
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += permutation.get(j);
            }

            int targetSum = (i + k - 1) * (i + k) / 2; // Average of elements in window
            int diff = targetSum - sum;

            if (diff > 0) {
                int increaseIndex = (i + k - 1) % n; // Choose index within window randomly
                permutation.set(increaseIndex, permutation.get(increaseIndex) + diff);
            } else if (diff < 0) {
                int decreaseIndex = i + random.nextInt(k); // Choose index within window randomly
                permutation.set(decreaseIndex, permutation.get(decreaseIndex) + diff);
            }
        }

        return permutation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            ArrayList<Integer> permutation = generatePermutation(n, k);
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
