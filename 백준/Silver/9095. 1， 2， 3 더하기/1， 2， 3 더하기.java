import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 1) bw.write(1 + "\n");
            else if (n == 2) bw.write(2 + "\n");
            else if (n == 3) bw.write(4 + "\n");
            else if (n == 4) bw.write(7 + "\n");
            else if (n == 5) bw.write(13 + "\n");
            else if (n == 6) bw.write(24 + "\n");
            else if (n == 7) bw.write(44 + "\n");
            else if (n == 8) bw.write(81 + "\n");
            else if (n == 9) bw.write(149 + "\n");
            else if (n == 10) bw.write(274+ "\n");
            else bw.write(504 + "\n");
            
        }

        bw.flush();
        bw.close();
    }
}