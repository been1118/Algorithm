import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken()) - 45;
        if (a % 60 < 0) {
            a += 24 * 60;
        }
        System.out.println(a/60 + " " + a%60);
    }
}