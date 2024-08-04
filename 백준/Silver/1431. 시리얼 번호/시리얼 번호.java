import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, ((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() == o2.length()) {
                if (sum(o1) == sum(o2)) return o1.compareTo(o2);
                else return Integer.compare(sum(o1), sum(o2));
            } else {
                return 1;
            }
        }));
        
        for (String s : arr) {
            bw.write(s + "\n");
        }
        
        bw.flush();
        bw.close();
    }

    public static int sum(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') sum += ch - '0';
        }

        return sum;
    }

}