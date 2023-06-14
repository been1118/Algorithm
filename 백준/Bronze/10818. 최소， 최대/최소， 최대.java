import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(st.nextToken());
            numList.add(a);
        }
        Collections.sort(numList);
        System.out.println(numList.get(0) + " " + numList.get(numList.size()-1));
    }
}