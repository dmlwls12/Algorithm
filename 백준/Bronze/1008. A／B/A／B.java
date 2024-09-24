import java.io.IOException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        BiFunction<Double, Double, Double> division = (x, y) -> {
            if (y == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return x / y;
        };

        try {
            System.out.println(division.apply(A, B));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
