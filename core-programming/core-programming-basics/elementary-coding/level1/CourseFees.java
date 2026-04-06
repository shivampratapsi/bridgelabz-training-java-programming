import java.util.Scanner;

public class CourseFees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = scanner.nextInt();
        float discountPercent = 10;
        float discount = fee / discountPercent;
        float finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

}
