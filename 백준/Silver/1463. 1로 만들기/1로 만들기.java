import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(cnt(N, 0)));
        bw.flush();
        bw.close();
    }

    public static int cnt(int N, int cnt) {
        if (N < 2) return cnt;
        return Math.min(cnt(N / 2, cnt + 1 + (N % 2)), cnt(N / 3, cnt + 1 + (N % 3)));
    }
}