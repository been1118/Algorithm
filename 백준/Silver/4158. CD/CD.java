import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break;

            int[] nArr = new int[N];
            int[] mArr = new int[M];

            for (int i = 0; i < N; i++) {
                nArr[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                mArr[i] = Integer.parseInt(br.readLine());
            }

            int cnt = 0;
            for (int i = 0; i < M; i++) {
                if (Arrays.binarySearch(nArr, mArr[i]) >= 0) cnt++;
            }
            System.out.println(cnt);
        }
    }
}