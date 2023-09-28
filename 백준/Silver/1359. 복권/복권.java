import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double res = 0.0;
        double p = Combination(n, m);

        while(m >= k){
            if(n - m < m - k){
                k++;
                continue;
            }
            
            double c = Combination(m, k) * Combination(n-m, m-k);

            res += c/p;
            k++;
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }

    static long Combination(int n, int r){
        int p = 1;
        int c = 1;

        while(r > 0){
            c *= n--;
            p *= r--;
        }
        return c / p;
    }
}