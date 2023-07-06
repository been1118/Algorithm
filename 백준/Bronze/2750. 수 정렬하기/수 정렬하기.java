import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            integers.add(b);
        }
        int t;
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size()-1; j++) {
                if (integers.get(j) < integers.get(j + 1)) {
                    t = integers.get(j);
                    integers.set(j, integers.get(j + 1));
                    integers.set(j + 1, t);
                }
            }
        }
        for (int i = integers.size()-1; i >= 0; i--) {
            bw.write(integers.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}