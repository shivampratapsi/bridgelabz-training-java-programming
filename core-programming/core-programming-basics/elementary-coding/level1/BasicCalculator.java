import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();

        // Addition
        System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));

        // Subtraction
        System.out.println("Subtraction of " + number2 + " from " + number1 + " is " + (number1 - number2));

        // Multiplication
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));

        // Division
        System.out.println("Division of " + number1 + " by " + number2 + " is " + (number1 / number2));

    }
}
