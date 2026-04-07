import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String result = ((input == 0) ? "zero" : (input > 0) ? "Positive" : "Negative");
        System.out.println(result);
        scanner.close();

    }

}
