import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;
            if (a + b <= c || b + c <= a || c + a <= b) {
                bw.write("Invalid" + "\n");
                continue;
            }
            if (a == b && b == c) {
                bw.write("Equilateral" + "\n");
                continue;
            }
            if (a == b || b == c || c == a) {
                bw.write("Isosceles" + "\n");
                continue;
            }
            if (a != b && b != c && c != a) {
                bw.write("Scalene" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}