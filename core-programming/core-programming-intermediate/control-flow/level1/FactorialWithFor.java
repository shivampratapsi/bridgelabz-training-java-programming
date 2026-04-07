
import java.util.Scanner;

public class FactorialWithFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("Factorial is " + 1);
        } else if (number > 1) {
            int product = 1;
            for (int i = number; i > 1; i--) {
                product *= number;
                number--;
            }
            System.out.println("Factorial is " + product);
        } else {
            System.out.println("Enter Positive number 0");
        }
        scanner.close();

    }
}