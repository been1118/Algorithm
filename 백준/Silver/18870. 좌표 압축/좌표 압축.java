import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ints = new int[n];
        int[] sInts = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = sInts[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sInts);

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int s = 0;
        for (int i : sInts) {
            if (!map.containsKey(i)){
                map.put(i, s);
                s++;
            }
        }

        for (int i : ints) {
            bw.write(map.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}