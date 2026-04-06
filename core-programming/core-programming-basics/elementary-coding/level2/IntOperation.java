import java.util.Scanner;

public class IntOperation {
    int a =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a != 0 && b != 0 && c != 0) {
            System.out.println("The results of Int Operations are " + (a + b * c) + "," + (a * b + c) + "," + (c + a / b)
                            + "and " + (a % b + c));
                        } else {
                            System.out.println("Please don't enter zero in any of the inputs !");
                        }
                        scanner.close();
    }
}
