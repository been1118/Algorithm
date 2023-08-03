import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());

            int left = 0;
            int right = N - 1;
            int mid;
            while (left <= right) {
                mid = (left + right) / 2;

                int titleInt = Integer.parseInt(arr[mid][1]);
                if (titleInt < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            bw.write(arr[left][0] + "\n");
        }
        bw.flush();
        bw.close();
    }
}