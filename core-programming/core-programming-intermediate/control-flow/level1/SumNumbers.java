import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long total = 0;
        while (true) {
            System.out.println("Enter number : ");
            long input = scanner.nextLong();
            if (input <= 0) {
                break;
            }
            total += input; 
        }
        System.out.printf("Total is %d", total);
        scanner.close();
    }
}