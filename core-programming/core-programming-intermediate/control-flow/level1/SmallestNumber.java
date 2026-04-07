import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();

        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest ? " + true);
        } else {
            System.out.println("Is the first number the smallest ? " + false);

        }
        scanner.close();
    }
}
