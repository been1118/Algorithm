import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] numList = new int[26];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(numList[str.charAt(i) - 'a'] == -1) numList[str.charAt(i) - 'a'] = i;
        }

        for (int n : numList) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}