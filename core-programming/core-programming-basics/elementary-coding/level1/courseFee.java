public class courseFee {
    public static void main(String[] args) {
        int fee = 125000;
        float discountPercent = 10;
        float discount = fee / discountPercent;
        float finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

    }

}
