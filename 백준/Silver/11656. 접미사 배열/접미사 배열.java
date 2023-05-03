import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String answer = bf.readLine();
        List<String> arrrayList = new ArrayList<>();
        arrrayList.add(answer);
        while(answer.length() > 1){
            arrrayList.add(answer.substring(1));
            answer = answer.substring(1);
        }
        Collections.sort(arrrayList);
        for (int i = 0; i < arrrayList.size(); i++) {
            System.out.println(arrrayList.get(i));
        }
    }
}