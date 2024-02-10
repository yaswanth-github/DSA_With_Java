import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }

            int[] nextDiff = new int[n];
            nextDiff[n - 1] = -1;

            for (int i = n - 2; i >= 0; i--) {
                nextDiff[i] = a[i] == a[i + 1] ? nextDiff[i + 1] : i + 1;
            }

            int q = Integer.parseInt(br.readLine());

            while (q-- > 0) {
                input = br.readLine().split(" ");
                int l = Integer.parseInt(input[0]) - 1;
                int r = Integer.parseInt(input[1]) - 1;

                if (nextDiff[l] != -1 && nextDiff[l] <= r) {
                    System.out.println((l + 1) + " " + (nextDiff[l] + 1));
                } else {
                    System.out.println("-1 -1");
                }
            }
        }
    }
}
