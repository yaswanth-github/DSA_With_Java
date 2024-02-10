import java.util.*;

public class QG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(minimumChargeUsages(n, a));
        }
    }

    public static int minimumChargeUsages(int n, int[] a) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 1; // First cell needs at least 1 charge

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j + a[j] >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] == Integer.MAX_VALUE) {
                dp[i] = dp[i - 1] + 1; // If no charge covers this cell, use one more than the previous one.
            }
        }
        return dp[n - 1];
    }
}
