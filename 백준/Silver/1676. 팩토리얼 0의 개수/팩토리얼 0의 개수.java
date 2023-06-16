import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 1; i <= a; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        String st = String.valueOf(number);
        int num = 0;
        for (int i = st.length()-1; i >= 1; i--) {
            if (st.charAt(i) == '0') num++;
            else break;
        }
        System.out.println(num);
    }
}