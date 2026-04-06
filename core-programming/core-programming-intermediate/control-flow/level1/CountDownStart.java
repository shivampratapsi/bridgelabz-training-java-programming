
import java.util.Scanner;

public class CountDownStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short input = scanner.nextShort();
        for (int i = input; i > 0; i--) {
            System.out.println(input);
            input--;
        }
        scanner.close();
    }
}