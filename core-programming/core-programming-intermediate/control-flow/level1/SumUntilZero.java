import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("Enter number : ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            total += input;
        }
        System.out.printf("Total is %d", total);
        scanner.close();
    }
}