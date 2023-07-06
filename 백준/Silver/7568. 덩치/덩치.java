import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[][] list = new int[3][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[0][i] = a;
            list[1][i] = b;
            list[2][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (list[0][i] < list[0][j]) {
                    if (list[1][i] >= list[1][j]) {
                        continue;
                    } else {
                        list[2][i]++;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            bw.write(list[2][i] + " ");
        }
        bw.flush();
        bw.close();
    }
}