import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue queue = new LinkedList();
        int b = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.startsWith("push")) {
                int a = Integer.parseInt(str.substring(5));
                b = a;
                queue.add(a);
            }
            if (str.equals("pop")) {
                if (queue.isEmpty()) bw.write(-1 + "\n");
                else bw.write(queue.poll() + "\n");
            }
            if (str.equals("size")) bw.write(queue.size() + "\n");
            if (str.equals("empty")) {
                if (queue.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }
            if (str.equals("front")) {
                if (queue.isEmpty()) bw.write(-1 + "\n");
                else bw.write(queue.peek() + "\n");
            }
            if (str.equals("back")) {
                if (queue.isEmpty()) bw.write(-1 + "\n");
                else bw.write(b + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}