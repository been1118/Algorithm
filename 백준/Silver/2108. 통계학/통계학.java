import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] intList = new int[N];
        double total = 0;
        int[][] maxList = new int[8001][2];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            intList[i] = num;
            total += num;
            maxList[intList[i] + 4000][0]++;
            maxList[intList[i] + 4000][1] = num;
        }

        Arrays.sort(maxList, ((o2, o1) -> {
            if (o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[0], o2[0]);
        }));
        int cb = 0;
        if (maxList[0][0] > maxList[1][0]) {
            cb = maxList[0][1];
        } else {
            for (int i = 1; i < maxList.length; i++) {
                if (maxList[i][0] > maxList[i + 1][0]) {
                    cb = maxList[i - 1][1];
                    break;
                }
            }
        }


        bw.write(Math.round(total / N) + "\n");
        Arrays.sort(intList);
        bw.write(intList[N / 2] + "\n");
        bw.write(cb + "\n");
        bw.write(intList[intList.length - 1] - intList[0] + "\n");
        bw.flush();
        bw.close();
    }
}