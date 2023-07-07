import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }
        int M = Integer.parseInt(br.readLine());
        int[] containsList = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            containsList[i] = num;
        }
        for (int i = 0; i < M; i++) {
            if (set.contains(containsList[i])) bw.write(1 + "\n");
            else bw.write(0 + "\n");
        }
        bw.flush();
        bw.close();
    }
}