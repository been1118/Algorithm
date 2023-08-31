import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("#")) break;
            if (Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) bw.write(str + " Senior\n");
            else bw.write(str + " Junior\n");
        }
        bw.flush();
        bw.close();
    }
}