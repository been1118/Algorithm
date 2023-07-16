import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }
        int cnt = 0;
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.containsKey(str)){
                cnt++;
                arr.add(str);
            }
        }
        Collections.sort(arr);
        bw.write(cnt + "\n");
        for (String s : arr) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}