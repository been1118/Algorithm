import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  a = br.readLine();
        StringTokenizer st = new StringTokenizer(a," ");
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        if(num > num2) System.out.println(">");
        if(num < num2) System.out.println("<");
        if(num == num2) System.out.println("==");
    }
}