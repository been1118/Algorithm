import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] intList = new Integer[N];
        for (int i = 0; i < N; i++) {
            intList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(intList, Comparator.reverseOrder());
        long answer = 0L;
        for (int i = 0; i < N; i++) {
            int num = intList[i] - i;
            answer += num >= 0L ? num : 0L;
        }

        System.out.println(answer);
    }
}