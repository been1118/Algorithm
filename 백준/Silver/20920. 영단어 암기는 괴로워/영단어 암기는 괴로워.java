import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap(N);

        String str;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (str.length() >= M) map.put(str, map.getOrDefault(str, 0) + 1);
        }

        String[] arr = map.keySet().toArray(new String[0]);

        Arrays.sort(arr, ((o1, o2) -> {
            if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                return Integer.compare(map.get(o2), map.get(o1));
            }

            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }

            return o1.compareTo(o2);
        }));

        for (String s : arr) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}