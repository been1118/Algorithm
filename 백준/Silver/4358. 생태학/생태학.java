import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String str = br.readLine();
            if (str == null || str.equals("")) break;
            map.put(str, map.getOrDefault(str, 0) + 1);
            cnt++;
        }
        Object[] list = map.keySet().toArray();
        Arrays.sort(list);

        for (Object o : list) {
            double per = (map.get(o.toString()) * 100.0) / cnt;
            bw.write(o + " " + String.format("%.4f", per) + "\n");

        }

        bw.flush();
        bw.close();
    }
}