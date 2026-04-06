import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float heightInCm = scanner.nextFloat();
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + (heightInCm / 30.68)
                + "and inches is " + (heightInCm / 2.54));

    }
}
