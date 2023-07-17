import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("-");
        for (int i = 0; i < str.length; i++) {
            int num = 0;
            try {
                Integer.parseInt(str[i]);
            } catch (NumberFormatException e) {
                String[] plus = str[i].split("\\+");
                for (int j = 0; j < plus.length; j++) {
                    num += Integer.parseInt(plus[j]);
                }
                str[i] = String.valueOf(num);
            }
        }
        int ans = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            ans -= Integer.parseInt(str[i]);
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

}