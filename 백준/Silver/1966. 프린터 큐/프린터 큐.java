import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            StringTokenizer stt = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();
            for (int j = 0; j < a; j++) {
                int c = Integer.parseInt(stt.nextToken());
                queue.add(new int[] {j, c});
            }
            int cnt = 0;
            while (!queue.isEmpty()) {
                int[] now = queue.remove();
                boolean flag = true;

                for (int q[] : queue) {
                    if (q[1] > now[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    cnt++;
                    if (now[0] == b) break;
                } else {
                    queue.add(now);
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}