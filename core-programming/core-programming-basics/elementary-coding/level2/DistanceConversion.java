import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float distanceInFeet = scanner.nextFloat();
        System.out.printf("Distance in miles is %.5f and yards is %.4f%n", (distanceInFeet / (1760.0f * 3.0f)),
                (distanceInFeet / 3.0f));

        scanner.close();
    }

}
