import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        long answer = 0;
        long c = 1;
        for(int i = 0; i < a; i++) {
            answer += ((b.charAt(i) - 96) * c);
            c = (c * 31) % 1234567891;
        }
        System.out.println(answer % 1234567891);

    }
}