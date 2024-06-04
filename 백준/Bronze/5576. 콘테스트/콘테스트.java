import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(br.readLine());
            }

            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length && k < arr.length; k++) {
                    if (arr[j] < arr[k]) {
                        int tmp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = tmp;
                    }
                }
            }

            for (int j = 0; j < 3; j++) {
                sum += arr[j];
            }

            bw.write(sum + " ");
        }

        bw.flush();
        bw.close();
    }
}