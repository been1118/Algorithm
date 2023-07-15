import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            bw.write(yesOrNo(str) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String yesOrNo(String str) {
        if (!str.endsWith(".")) return "no";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') stack.push('(');
            if (ch == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else stack.pop();
            }

            if (ch == '[') stack.push('[');
            if (ch == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else stack.pop();
            }
        }
        if (stack.empty()) return "yes";
        else return "no";
    }
}