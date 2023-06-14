import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            int num = 0;
            int answer = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O'){
                    num++;
                    answer += num;
                } else {
                    num = 0;
                }
            }
            System.out.println(answer);
        }
    }
}