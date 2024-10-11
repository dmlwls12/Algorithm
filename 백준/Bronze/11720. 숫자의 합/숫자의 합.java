
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';

            sum += n;
        }

        bw.write(String.valueOf(sum));

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
