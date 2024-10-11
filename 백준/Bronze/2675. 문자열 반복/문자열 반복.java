
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                for(int k = 0; k < r; k++){
                    sb.append(c);
                }
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
