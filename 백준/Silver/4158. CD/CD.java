import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<Integer> set;
        while (true) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break;

            set = new HashSet<>();

            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < M; i++) {
                if (set.contains(Integer.parseInt(br.readLine()))) cnt++;
            }
            System.out.println(cnt);
        }

    }
}