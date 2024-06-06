import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int rank = Integer.parseInt(st.nextToken());
                arr[rank - 1] = Integer.parseInt(st.nextToken());
            }

            int cnt = 1;
            int comp = arr[0];
            for (int j = 1; j < N; j++) {
                if (arr[j] < comp) {
                    cnt++;
                    comp = arr[j];
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}