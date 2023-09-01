import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().replaceAll("[aeiouAEIOU]", "*");
        while (!str.equals("#")){
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') cnt++;
            }
            bw.write(cnt + "\n");
            str = br.readLine().replaceAll("[aeiouAEIOU]", "*");
        }
        bw.flush();
        bw.close();
    }
}