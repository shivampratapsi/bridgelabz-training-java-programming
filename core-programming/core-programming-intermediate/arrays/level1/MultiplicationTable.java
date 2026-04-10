import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short[] table = new short[10];
        System.out.println("Enter number for a table :");
        short number = scanner.nextShort();

        for (short i = 0; i < table.length; i++) {
            table[i] = (short) (number * (i + 1));
        }
        System.out.println("Multiplication table of " + number + " is :");
        for (short i = 0; i < table.length; i++) {
            System.out.printf("%d * %d = %d %n", number, i + 1, table[i]);
        }
        scanner.close();

    }
}