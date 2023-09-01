import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            total += n >= 40 ? n : 40;
        }
        bw.write(String.valueOf(total / 5));
        bw.flush();
        bw.close();
    }
}