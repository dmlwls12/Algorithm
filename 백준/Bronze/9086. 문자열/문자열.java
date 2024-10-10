
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            arr[i]  = br.readLine();

        }

        for(int i = 0; i < t; i++) {
            String s = arr[i];
            bw.write(s.charAt(0) +  "" + s.charAt(s.length() - 1) + "\n");
        }


        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
