import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        if (N < 100) {
            answer = N;
        } else {
            answer = 99;
            for (int j = 100; j <= N; j++) {
                String str = String.valueOf(j);
                if ((str.charAt(0) - str.charAt(1)) == (str.charAt(1) - str.charAt(2))) {
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }
}