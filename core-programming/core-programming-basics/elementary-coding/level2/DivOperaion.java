import java.util.Scanner;

public class DivOperaion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 != 0) {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.println("The Quotient is " + quotient + " and remainder is " + remainder + " of two number "
                    + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero not allowed !");
        }
        scanner.close();

    }

}
