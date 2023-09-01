import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = Integer.parseInt(br.readLine()); i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}