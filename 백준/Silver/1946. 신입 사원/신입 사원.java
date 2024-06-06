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

            int[][] arr = new int[N][2];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, ((o1, o2) -> {
                return o1[0] - o2[0];
            }));

            int cnt = 1;
            int comp = arr[0][1];
            for (int j = 1; j < N; j++) {
                if (arr[j][1] < comp) {
                    cnt++;
                    comp = arr[j][1];
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}