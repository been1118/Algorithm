import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] rope = new int[num];

        for (int i = 0; i < num; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = 0;
        for (int i = 0; i < num; i++) {
            max = Math.max(max, rope[i] * (num - i));
        }

        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}