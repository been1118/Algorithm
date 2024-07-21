import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack;
        loop1 : while(true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            if (!str.endsWith(".")) {
                bw.write("no\n");
                continue;
            }

            stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(') stack.push('(');
                if (ch == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        bw.write("no\n");
                        continue loop1;
                    } else {
                        stack.pop();
                    }
                }

                if (ch == '[') stack.push('[');
                if (ch == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        bw.write("no\n");
                        continue loop1;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
        bw.close();
    }
}