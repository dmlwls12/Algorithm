
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] brStr = br.readLine().split(" ");

        int hour = Integer.parseInt(brStr[0]);
        int min = Integer.parseInt(brStr[1]);
        int time = Integer.parseInt(br.readLine());

        hour += time / 60;
        min += time % 60;

        if(min >= 60) {
            min -= 60;
            hour += 1;
        }
        if(hour >= 24) {hour -= 24;}

        System.out.println(hour + " " + min);
    }
}
