import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

public class Main {
    static int H, W;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            map = new int[H][W];
            int n = 0;
            for (int i = 0; i < H; i++) {
                String[] input = br.readLine().split("");
                for (int j = 0; j < W; j++) {
                    String tmp = input[j];

                    if (tmp.equals("#")) {
                        map[i][j] = 1;
                    } else map[i][j] = 0;
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == 1) {
                        n++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        map[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < H && ny >= 0 && ny < W && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}