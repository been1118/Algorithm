import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int z = (int)((long) y * 100 / x);

        int min = 0;
        int max = 1_020_000_000;
        int mid;
        int answer = -1;

        while (min < max) {
            mid = (max + min) / 2;

            if (((long)(y + mid) * 100) / (x + mid) > z) {
                answer = mid;
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(answer);
    }
}