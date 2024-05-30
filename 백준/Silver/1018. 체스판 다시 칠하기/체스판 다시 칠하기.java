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

        boolean[][] arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) == 'B';
            }
        }

        int answer = 64;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int cnt = 0;
                boolean tf = arr[i][j];

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (arr[k][l] != tf) cnt++;
                        tf = !tf;
                    }
                    tf = !tf;
                }
                cnt = Math.min(cnt, 64 - cnt);
                answer = Math.min(answer, cnt);
            }
        }

        System.out.println(answer);
    }
}