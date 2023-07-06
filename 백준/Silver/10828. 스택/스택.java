import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.startsWith("push")) {
                int a = Integer.parseInt(str.substring(5));
                stack.add(a);
            }
            if (str.equals("pop")){
                if (stack.isEmpty()) bw.write(-1 + "\n");
                else  bw.write(stack.pop() + "\n");
            }
            if (str.equals("size")) bw.write(stack.size() + "\n");
            if (str.equals("empty")) {
                if (stack.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }
            if (str.equals("top")) {
                if (stack.isEmpty()) bw.write(-1 + "\n");
                else bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}