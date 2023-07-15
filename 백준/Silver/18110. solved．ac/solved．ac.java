import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] intList = new int[N];
        int num = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            intList[i] = a;
        }
        Arrays.sort(intList);
        int per = (int) Math.round(((N / 10.0) * 3.0) / 2.0);
        for (int i = per; i < N - per; i++) {
            num += intList[i];
        }
        bw.write(String.valueOf((int) Math.round(num / (N - (per * 2.0)))));
        bw.flush();
        bw.close();
    }
}