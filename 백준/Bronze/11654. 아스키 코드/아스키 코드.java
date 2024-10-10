
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = br.readLine().charAt(0);
        int n = (int) c;

        bw.write(String.valueOf(n));

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
