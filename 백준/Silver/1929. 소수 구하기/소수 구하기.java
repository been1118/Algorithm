import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int length = M + 1;
        int[] numList = new int[length];
        for (int i = 2; i <= M; i++) {
            numList[i] = i;
        }
        for (int i = 2; i <= M; i++) {
            if (numList[i] == 0) continue;
            for (int j = 2 * i; j <= M; j += i) {
                numList[j] = 0;
            }
        }
        for (int i = 0; i <= M; i++) {
            if (i < N) continue;
            if (numList[i] != 0) bw.write(numList[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}