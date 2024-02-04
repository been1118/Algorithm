import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a % 10 == 0) {
                bw.write(10 + "\n");
                continue;
            }
            
            int num = a % 10;
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}