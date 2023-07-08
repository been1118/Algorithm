import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            int num = 0;
            if (cmd.startsWith("push_back")) {
                num = Integer.parseInt(cmd.substring(10));
                cmd = "push_back";
            }
            if (cmd.startsWith("push_front")) {
                num = Integer.parseInt(cmd.substring(11));
                cmd = "push_front";
            }
            switch (cmd) {
                case "push_front": {
                    deque.addFirst(num);
                    break;
                }
                case "push_back": {
                    deque.addLast(num);
                    break;
                }
                case "pop_front": {
                    if (deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.removeFirst() + "\n");
                    break;
                }
                case "pop_back": {
                    if (deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.removeLast() + "\n");
                    break;
                }
                case "size": {
                    bw.write(deque.size() + "\n");
                    break;
                }
                case "empty": {
                    if (deque.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                }
                case "front": {
                    if (deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.peekFirst() + "\n");
                    break;
                }
                case "back": {
                    if (deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.peekLast() + "\n");
                    break;
                }
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}