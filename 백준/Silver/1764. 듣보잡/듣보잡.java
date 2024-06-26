import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>(Math.max(N, M));
        String str;
        for (int i = 0; i < M; i++) {
            str = br.readLine();
            if (set.contains(str)) list.add(str);
        }

        Collections.sort(list);

        bw.write(list.size() + "\n");
        
        for (String s : list) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}