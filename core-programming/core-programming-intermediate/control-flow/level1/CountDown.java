import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextShort();
        while (input > 0) {
            System.out.println(input);
            input--;
        }
        scanner.close();
    }
}