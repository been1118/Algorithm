import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            String answer = "";
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            for (int i = 0; i < str.length(); i++) {
                answer += stack.pop();
            }

            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
    }
}