import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int bj1 = Integer.parseInt(st.nextToken());
        int bm1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int bj2 = Integer.parseInt(st.nextToken());
        int bm2 = Integer.parseInt(st.nextToken());

        int N = bm1 * bj2 + bm2 * bj1;
        int M = bm1 * bm2;

        int minN = N > M ? M : N;

        for (int i = minN; true; i--) {
            if (N % i == 0 && M % i == 0) {
                System.out.println(N / i + " " + M / i);
                break;
            }
        }
    }
}