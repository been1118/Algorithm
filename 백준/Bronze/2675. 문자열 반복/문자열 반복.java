import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String[] str = br.readLine().split(" ");

            int num = Integer.parseInt(str[0]);

            String[] str2 = str[1].split("");

            for (String ch : str2) {
                for (int j = 0; j < num; j++) {
                    sb.append(ch);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}