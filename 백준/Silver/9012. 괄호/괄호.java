import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            bw.write(yesOrNo(str) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String yesOrNo(String str) {
        Stack<String> stack = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') stack.push("ok");
            else if (stack.empty()) return "NO";
            else stack.pop();
        }
        if (stack.empty()) return "YES";
        else return "NO";
    }
}