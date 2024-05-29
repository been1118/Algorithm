import java.io.*;
import java.util.Arrays;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n;
			sum += n;
		}

		loop1 : for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					arr[i] = 100;
					arr[j] = 100;
					Arrays.sort(arr);
					for (int k = 0; k < 7; k++) {
						bw.write(arr[k] + "\n");
					}
					break loop1;
				}
			}
		}

		bw.flush();
		bw.close();
	}
}