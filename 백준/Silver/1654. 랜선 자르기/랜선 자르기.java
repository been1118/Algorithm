import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] intList = new int[N];

        long max = 0;

        for (int i = 0; i < N; i++) {
            intList[i] = Integer.parseInt(br.readLine());
            if (max < intList[i]) max = intList[i];
        }

        max++;
        
        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;

            for (int i = 0; i < N; i++) {
                count += (intList[i] / mid);
            }

            if (count < M) max = mid;
            else min = mid + 1;
        }

        System.out.println(min - 1);
    }
}