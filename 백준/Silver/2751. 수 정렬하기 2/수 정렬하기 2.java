import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set set = new HashSet();
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num);
        }

        ArrayList<Integer> ary = new ArrayList<>(set);
        Collections.sort(ary);
        for (Integer s : ary) {
            bw.write( s+ "\n");
        }
        bw.flush();
        bw.close();
    }
}