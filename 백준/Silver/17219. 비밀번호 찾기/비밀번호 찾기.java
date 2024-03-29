import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        StringTokenizer stt;
        for (int i = 0; i < N; i++) {
            stt = new StringTokenizer(br.readLine());
            map.put(stt.nextToken(), stt.nextToken());
        }
        for (int i = 0; i < M; i++) {
            stt = new StringTokenizer(br.readLine());
            bw.write(map.get(stt.nextToken()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}