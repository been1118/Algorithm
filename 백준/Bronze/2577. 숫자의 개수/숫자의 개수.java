import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int num = a * b * c;
        int[] numList = new int[10];
        while(num != 0){
            numList[num%10]++;
            num /= 10;
        }
        for (int n : numList) {
            System.out.println(n);
        }
    }
}