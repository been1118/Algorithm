import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] intList = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            intList[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = intList[i];
            for (int j = i + 1; j < N + 1; j++) {
                if (num == M) {
                    cnt++;
                    break;
                }
                if (j == N) break;
                num += intList[j];
                if (num == M) {
                    cnt++;
                    break;
                } else if (num > M) {
                    break;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

}