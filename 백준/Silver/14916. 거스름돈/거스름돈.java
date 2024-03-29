import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        if (N == 0) cnt = -1;
        while (N != 0) {
            if (N == 1 || N == 3){
                cnt = -1;
                break;
            }
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            }
            N -= 2;
            cnt++;
            
        }

        System.out.println(cnt);
    }
}