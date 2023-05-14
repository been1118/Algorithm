import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  a = br.readLine();
        StringTokenizer st = new StringTokenizer(a," ");
        double num = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());
        System.out.println(num / num2);
    }
}