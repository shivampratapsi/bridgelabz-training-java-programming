import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sumWithLoop = 0;
        int copy = input;

        if (input > 0) {
            while (input > 0) {
                sumWithLoop += input;
                input--;
            }
            int sumWithFormula = (copy * (copy + 1)) / 2;
            System.out.println("Output with while loop :" + sumWithLoop);
            System.out.println("Output with formula :" + sumWithFormula);
        } else {
            System.out.println("Enter only natural numbers !");
        }
        scanner.close();
    }
}