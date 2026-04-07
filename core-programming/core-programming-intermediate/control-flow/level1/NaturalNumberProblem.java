import java.util.Scanner;

public class NaturalNumberProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        if (input > 0) {
            long sum = (input * (input + 1)) / 2;
            System.out.println("The sum of " + input + " natural numbers is " + sum);

        } else {
            System.out.println("The number "+input+" is not a natural number.");
        }
        scanner.close();
    }
}
