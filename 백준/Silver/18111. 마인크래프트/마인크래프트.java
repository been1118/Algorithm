import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] world = new int[n][m];
        int minTime = Integer.MAX_VALUE;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                world[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int height = 0;
        int cnt = 257;

        while (cnt-- > 0) {
            int one = 0;
            int two = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int tmp = world[i][j] - height;
                    if (tmp > 0) one += tmp;
                    else if (tmp < 0) two += (-tmp);
                }
            }
            int time = one * 2 + two * 1;

            if (time >= 0 && (b + one - two) >= 0) {
                if (minTime >= time) {
                    minTime = time;
                    if (maxHeight < height) maxHeight = height;
                }
            }
            height++;
        }
        System.out.println(minTime + " " + maxHeight);
    }
}