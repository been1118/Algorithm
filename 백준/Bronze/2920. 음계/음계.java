import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if((a + 1) == b && b + 1 == c && c + 1 == d && d + 1 == e && e + 1 == f && f + 1 == g) System.out.println("ascending");
        else if((a - 1) == b && b - 1 == c && c - 1 == d && d - 1 == e && e - 1 == f && f - 1 == g) System.out.println("descending");
        else System.out.println("mixed");
    }
}