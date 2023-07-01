import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String st = br.readLine();
            map.put(st, st.length());
        }

        List<String> entryList = new ArrayList<>(map.keySet());
        Collections.sort(entryList);
        Collections.sort(entryList, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));

        for (String key : entryList) {
            bw.write(key + "\n");
        }

        bw.flush();
        bw.close();
    }
}