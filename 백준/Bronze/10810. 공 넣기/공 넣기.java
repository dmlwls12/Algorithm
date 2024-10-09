
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;   // 배열 인덱스는 0부터 시작하므로 1을 빼줌
            int j = Integer.parseInt(st.nextToken()) - 1;   // 배열 인덱스는 0부터 시작하므로 1을 빼줌
            int k = Integer.parseInt(st.nextToken());

            // i번 바구니부터 j번 바구니까지 k번 공을 넣음
            for(int b = i; b <= j; b++) {
                arr[b] = k;
            }
        }

        // 각 바구니에 들어있는 공 번호 출력
        for(int num : arr) {
            bw.write(num + " ");
        }

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
