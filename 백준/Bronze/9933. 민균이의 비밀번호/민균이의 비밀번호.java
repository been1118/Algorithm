import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuffer answer = new StringBuffer();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            int length = str.length();

            if (str.equals(reverse) || set.contains(reverse)) {
                answer = answer.append(length).append(" ").append(str.substring(length / 2, length / 2+1));
                break;
            } else {
                set.add(str);
            }
        }

        System.out.println(answer);
    }
}