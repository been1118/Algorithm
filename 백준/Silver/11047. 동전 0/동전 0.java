import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] intList = new int[n];
        for (int i = 0; i < n; i++) {
            intList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intList);
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            int idx = intList[i];
            if (idx > k) continue;
            cnt += k / idx;
            k %= idx;
        }
        System.out.println(cnt);
    }
}