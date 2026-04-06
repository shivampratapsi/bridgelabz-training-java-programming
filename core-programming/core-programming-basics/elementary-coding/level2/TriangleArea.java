import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float heightOfTriangle = scanner.nextFloat();
        float BaseOfTriangle = scanner.nextFloat();
        float areaInCm = ((float) 1 / 2) * BaseOfTriangle * heightOfTriangle;
        float areaInInches = ((float) 1 / 2) * (BaseOfTriangle / 0.39f) * (heightOfTriangle / 0.39f);
        System.out.printf(
                "Area of Triangle in cm is %.2f square centimeters and area of triangle in inches is %.2f square inches ",
                areaInCm, areaInInches);

        scanner.close();

    }
}
