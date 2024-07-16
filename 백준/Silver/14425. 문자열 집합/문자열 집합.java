import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            set.add(br.readLine());
        }

        int cnt = 0;
        
        for (int i = 0; i < S; i++) {
            if (set.contains(br.readLine())) cnt++;   
        }

        System.out.println(cnt);
    }
}