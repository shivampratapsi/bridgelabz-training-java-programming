import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers below line by line :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The first number is largest!");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The second number is largest!");
        } else {
            System.out.println("The third number is largest!");
        }
        scanner.close();

    }
}
