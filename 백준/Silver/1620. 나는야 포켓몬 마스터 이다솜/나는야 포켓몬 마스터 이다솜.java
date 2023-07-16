import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int length = N + 1;
        Map<Integer, String> mapInt = new HashMap<>();
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 1; i < length; i++) {
            String str = br.readLine();
            mapInt.put(i, str);
            mapStr.put(str, i);
        }

        int num;

        for (int i = 0; i < Q; i++) {
            String str = br.readLine();
            try {
                num = Integer.parseInt(str);
                bw.write(mapInt.get(num) + "\n");
            } catch (NumberFormatException e) {
                bw.write(mapStr.get(str) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}