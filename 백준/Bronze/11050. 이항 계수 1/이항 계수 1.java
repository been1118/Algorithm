import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for (int i = 1; i <= a; i++) {
            num1 *= i;
        }
        for (int i = 1; i <= b; i++) {
            num2 *= i;
        }
        for (int i = 1; i <= a-b; i++) {
            num3 *= i;
        }
        System.out.println(num1/(num2*num3));
    }
}