
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        int a = Integer.parseInt(new StringBuilder(s1).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(s2).reverse().toString());

        bw.write(String.valueOf(a > b ? a : b));

        bw.flush();
        br.close();
        bw.close();
    }

}
