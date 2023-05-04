import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (number == 1)continue;
            for (int j = 2; j <= number; j++) {
                if(number == j) count++;
                if(number % j == 0) break;
            }
        }
        System.out.println(count);
    }
}