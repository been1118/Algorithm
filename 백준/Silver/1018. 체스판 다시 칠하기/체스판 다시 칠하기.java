import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] cp = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String tf = br.readLine();
            for (int j = 0; j < M; j++) {
                if (tf.charAt(j) == 'W') cp[i][j] = true;
                else cp[i][j] = false;
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;
        int cnt = 64;
        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                int end_X = i + 8;
                int end_Y = j + 8;
                int nCnt = 0;
                boolean tf = cp[i][j];

                for (int k = i; k < end_X; k++) {
                    for (int l = j; l < end_Y; l++) {
                        if (cp[k][l] != tf) nCnt++;
                        tf = !tf;
                    }
                    tf = !tf;
                }
                nCnt = Math.min(nCnt, 64 - nCnt);
                cnt = Math.min(nCnt, cnt);
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}