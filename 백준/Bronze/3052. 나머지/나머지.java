
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
         * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
         *
         * 수 10개를 입력받은 뒤,
         * // 방이 10개인 배열
         *
         * 이를 42로 나눈 나머지를 구한다.
         * // 반복문에서 나눗셈
         *
         * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
         * // 조건문 이용
         */

        HashSet<Integer> remainders = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42;
            remainders.add(remainder);
        }

        bw.write(String.valueOf(remainders.size()));

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

}
