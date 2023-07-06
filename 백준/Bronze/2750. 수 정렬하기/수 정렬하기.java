import java.io.*;

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
        int t;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                if (list[j] < list[j + 1]) {
                    t = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = t;
                }
            }
        }
        for (int i = a - 1; i >= 0; i--) {
            bw.write(list[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}