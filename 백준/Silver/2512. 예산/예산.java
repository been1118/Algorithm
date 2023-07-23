import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intList = new int[N];
        int left = 0, right = -1;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            intList[i] = num;
            right = Math.max(right, num);
        }
        int m = Integer.parseInt(br.readLine());
        while (left <= right) {
            int mid = (left + right) / 2;
            long budget = 0;
            for (int i = 0; i < N; i++) {
                if (intList[i] > mid) budget += mid;
                else budget += intList[i];
            }
            if (budget <= m) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(right);
    }
}