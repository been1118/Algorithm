import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        while (a != 0) {
            for (int i = a; i > 0; i--) {
                bw.write("*");
            }
            bw.write("\n");
            a--;
        }
        bw.flush();
        bw.close();
    }
}