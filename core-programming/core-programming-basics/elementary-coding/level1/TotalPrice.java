import java.util.Scanner;

class TotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float unitPrice = scanner.nextFloat();
        int quantity = scanner.nextInt();
        System.out.println("The total purchase price is INR " + (unitPrice * quantity) + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);

    }
}
