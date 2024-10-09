
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        /*
        * 도현이는 바구니를 총 N개 가지고 있고,
        * 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
        * // 방 n개인 배열
        *
        * 도현이는 앞으로 M번 공을 바꾸려고 한다.
        * // 작업 m번 수행
        *
        * 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
        * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
        *  */

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n];

        for(int t = 0; t < n; t++) {
            baskets[t] = t + 1;     // 1번부터 n번까지 공을 넣음
        }

        // i번과 j번 바구니 번호
        for(int t = 0; t < m; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;   // i번 바구니 (배열 인덱스는 0부터 시작하므로 -1)
            int j = Integer.parseInt(st.nextToken()) - 1;   // j번 바구니 (배열 인덱스는 0부터 시작하므로 -1)

            // i번과 j번 바구니 공 교환
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        
        // 결과 출력
        for(int num : baskets) {
            bw.write(num + " ");
        }

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
