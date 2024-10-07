
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int find = Integer.parseInt(br.readLine());

        int count = countOccurrences(intArr, find);

        System.out.println(count);

    }

    public static int countOccurrences(int[] arr, int find) {
        int count = 0;
        for(Integer element : arr) {
            if(element.equals(find)) {
                count++;
            }
        }
        return count;
    }
}
