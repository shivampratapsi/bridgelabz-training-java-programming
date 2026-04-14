import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        try {
            byte age = scanner.nextByte();
            if (age > 0) {
                String eligibility = (age >= 18) ? "The Person's age is " + age + " and can vote."
                        : "The Person's age is " + age + " and cannot vote.";
                System.out.println(eligibility);
            } else {
                System.out.println("Please enter correct age !");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid age");
        }
        scanner.close();

    }
}
