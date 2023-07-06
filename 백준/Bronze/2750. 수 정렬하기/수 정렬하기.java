import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            list[i] = b;
        }
        Arrays.sort(list);
        for (int i = 0; i < a; i++) {
            bw.write(list[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}