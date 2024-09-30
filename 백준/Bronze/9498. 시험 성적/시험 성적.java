
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] brStrings = br.readLine().split(" ");
        
        int score = Integer.parseInt(brStrings[0]);
        
        if(90 <= score) {
            System.out.println("A");
        } else if(80 <= score && score < 90) {
            System.out.println("B");
        } else if(70 <= score && score < 80) {
            System.out.println("C");
        } else if(60 <= score && score < 70) {
            System.out.println("D");
        } else{
            System.out.println("F");
        }
        
    }
}
