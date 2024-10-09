import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
         * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
         *
         * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
         */

        // 과목 개수 입력
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 현재 성적 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 찾기
        int max = Arrays.stream(arr).max().getAsInt();

        // 새로운 평균 계산
        double sum = 0;
        for(int score : arr) {
            sum += (double) score / max * 100;
        }

        double avg = sum / n;

        bw.write(String.valueOf(avg));

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}