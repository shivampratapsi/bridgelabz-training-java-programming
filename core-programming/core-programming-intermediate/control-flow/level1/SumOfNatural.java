
import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Natural number for sum :");
        long number = scanner.nextLong();
        if (number > 0) {
            long sumWithLoop = 0;
            for (long i = number; i > 0; i--) {
                sumWithLoop += i;
            }

            long sumWithFormulae = (number * (number + 1)) / 2;

            System.out.println("Sum with for-loop is :" + sumWithLoop);
            System.out.println("Sum with formulae is :" + sumWithFormulae);

            scanner.close();
        } else {
            System.out.println("Enter Number greater than 0");
        }

    }
}