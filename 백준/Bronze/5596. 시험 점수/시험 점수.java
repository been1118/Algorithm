import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int S = 0;
        int T = 0;
        for (int i = 0; i < 4; i++) {
            S += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            T += Integer.parseInt(st.nextToken());
        }
        if (S >= T) bw.write(String.valueOf(S));
        else bw.write(String.valueOf(T));
        bw.flush();
        bw.close();
    }
}