import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float perimeterOfSquare = scanner.nextFloat();

        System.out.println("The length of side is " + (perimeterOfSquare / 4) + " whose perimeter is " + perimeterOfSquare);
        scanner.close();
    }

}
