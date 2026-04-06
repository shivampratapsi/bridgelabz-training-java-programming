import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("Factorial is " + 1);
        } else if (number > 1) {
            int product = 1;
            while (number > 1) {
                product *= number;
                number--;
            }
            System.out.println("Factorial is " + product);
        } else {
            System.out.println("Enter Positive Number ");
        }
    }
}