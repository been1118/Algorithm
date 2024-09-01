import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Queue<String>> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            list.add(new LinkedList<>(Arrays.asList(br.readLine().split(" "))));
        }

        String[] L = br.readLine().split(" ");

        for (String word : L) {
            boolean found = false;
            for (Queue<String> parrot : list) {
                if (!parrot.isEmpty() && parrot.peek().equals(word)) {
                    parrot.poll();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Impossible");
                return;
            }
        }

        for (Queue<String> parrot : list) {
            if (!parrot.isEmpty()) {
                System.out.println("Impossible");
                return;
            }
        }

        System.out.println("Possible");
    }
}