import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float distanceInFeet = scanner.nextFloat();

        System.out.println("Distance in miles is " + (distanceInFeet / (1760 * 3)) + " and yards is "
                + ((float) distanceInFeet / 3));
    }

}
