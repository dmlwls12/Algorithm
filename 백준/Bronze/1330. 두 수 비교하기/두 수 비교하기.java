
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        StringTokenizer st = new StringTokenizer(number, " ");
        while (st.hasMoreTokens()) {
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 > num2) {
                System.out.println(">");
            } else if (num1 < num2) {
                System.out.println("<");
            } else if (num1 == num2) {
                System.out.println("==");
            }
        }


    }
}
