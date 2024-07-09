import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 5];

        int maxVal = 9999;

        Arrays.fill(dp,  maxVal);
        dp[3] = dp[5] = 1;

        for(int i = 6; i <= N + 1; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }

        System.out.println(dp[N] >= maxVal ? -1 : dp[N]);
    }
}