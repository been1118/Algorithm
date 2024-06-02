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

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int answer = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 1; (i + k < N) && (j + k < M); k++) {
                    if (arr[i][j] == arr[i][j + k] && arr[i][j] == arr[i + k][j] && arr[i][j] == arr[i + k][j + k]) {
                        answer = Math.max(answer, (k + 1) * (k + 1));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}