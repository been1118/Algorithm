import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int S = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num;
            switch (s) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    S |= (1 << num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    S &= ~(1 << num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    int a = (S & (1 << num)) != 0 ? 1 : 0;
                    bw.write(a + "\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    S ^= (1 << num);
                    break;
                case "all":
                    S = (1 << 21) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}