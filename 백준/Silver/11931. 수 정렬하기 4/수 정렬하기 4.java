import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] integers = new Integer[N];

        for (int i = 0; i < N; i++) {
            integers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(integers, Comparator.reverseOrder());

        for (Integer integer : integers) {
            bw.write(integer + "\n");
        }

        bw.flush();
        bw.close();
    }
}