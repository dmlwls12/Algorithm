
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(Integer.toString(s.length()));

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
