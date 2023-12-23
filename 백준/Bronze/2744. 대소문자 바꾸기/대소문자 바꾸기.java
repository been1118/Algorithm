import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) bw.write(String.valueOf(ch).toUpperCase());
            else bw.write(String.valueOf(ch).toLowerCase());
        }

        bw.flush();
        bw.close();
    }
}