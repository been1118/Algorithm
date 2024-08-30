import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static int answer;
    public static List<Integer>[] edgeList;
    public static boolean[] visited;
    public static int[] dfsArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dfsArr = new int[N];
        edgeList = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) {
            edgeList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            edgeList[from].add(to);
            edgeList[to].add(from);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int start) {
        visited[start] = true;
        for (int to : edgeList[start]) {
            if (!visited[to]) {
                dfs(to);
            }
        }
    }
}