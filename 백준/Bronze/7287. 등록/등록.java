import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("127" + "\n" + "a9150363a");

        bw.flush();
        bw.close();
    }
}