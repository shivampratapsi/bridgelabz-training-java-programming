import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a != 0 && b != 0 && c != 0) {
            System.out.printf("The results of float Operation are %.3f , %.3f , %.3f ,and %.3f ", (a + b * c), (a * b + c), (c + a / b), (a % b + c));

        } else {
            System.out.println("Please enter number other than zero");
        }

        scanner.close();
    }
}