import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<Integer> numList = new ArrayList<>();
        List<Integer> numList2 = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(str.nextToken());
            numList.add(num);
        }

        for (int i = 0; i < numList.size(); i++) {
            int c = numList.get(i);
            for (int j = 0; j < numList.size(); j++) {
                int d = 0;
                if(numList.get(j) != c) d = c + numList.get(j);
                for (int k = 0; k < numList.size(); k++) {
                    int e = 0;
                    if(numList.get(k) != numList.get(i) && numList.get(k) != numList.get(j)) e = d + numList.get(k);
                    numList2.add(e);
                }
            }
        }
        Collections.sort(numList2);
        int answer = 0;
        for (int i = 0; i < numList2.size(); i++) {
            if(i+1 == numList2.size()) break;
            if(numList2.get(i) < numList2.get(i+1) && numList2.get(i+1) <= b){
                answer = numList2.get(i+1);
            }
        }
        System.out.println(answer);
    }
}