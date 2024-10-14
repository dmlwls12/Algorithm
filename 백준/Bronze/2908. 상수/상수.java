
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = st.countTokens();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] reversedArr = new int[intArr.length];

        // 자리 바꾸기
        for (int i = 0; i < intArr.length; i++) {
            int temp = intArr[i];

            int ones = temp % 10;
            int tens = (temp / 10) % 10;
            int hundreds = (temp / 100) % 10;

            reversedArr[i] = ones * 100 + tens * 10 + hundreds;
        }

        int max = reversedArr[0];

        for(int num : reversedArr) {
            if(num > max) max = num;
        }

        bw.write(String.valueOf(max));

        bw.flush();
        br.close();
        bw.close();
    }

}
