import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            numList.add(a%42);
        }
        Collections.sort(numList);
        int answer = 1;
        for (int i = 0; i < numList.size(); i++) {
            if(i+1 >= numList.size()) break;
            if(numList.get(i) != numList.get(i+1)) answer++;
        }
        System.out.println(answer);
    }
}