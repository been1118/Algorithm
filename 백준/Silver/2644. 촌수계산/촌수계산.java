import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] check;
    static int[][] arr;

    static int node, a, b, line;

    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        line = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < line ; i ++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] =  1;
        }

        dfs(a, 0);

        System.out.println(answer);
    }

    public static void dfs(int start, int depth) {
        check[start] = true;

        if (start == b) {
            answer = depth;
            return;
        }

        for(int i = 1; i <= node ; i++) {
            if(arr[start][i] == 1 && !check[i]) dfs(i, depth + 1);
        }
    }
}