import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack<>();
        while (true){
            String st = br.readLine();
            if (st.equals("0")) break;

            for (int i = 0; i < st.length(); i++) {
                stack.push(st.charAt(i));
            }
            String st2 = "";
            for (int i = 0; i < st.length(); i++) {
                st2 += stack.pop();
            }
        if (st.equals(st2)) System.out.println("yes");
        else System.out.println("no");
        }
    }
}