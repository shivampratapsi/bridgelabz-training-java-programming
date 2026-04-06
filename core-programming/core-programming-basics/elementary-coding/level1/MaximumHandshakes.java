import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        System.out.println("The number of possible handshakes are " + ((numberOfStudent) * (numberOfStudent - 1)) / 2);
    }
}
