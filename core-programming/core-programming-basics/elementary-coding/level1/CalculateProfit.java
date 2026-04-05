public class CalculateProfit {
    static String profitCalc(int costPrice, int sellingPrice) {
        int profit = sellingPrice - costPrice;
        String answer = "The Cost Price is INR  " + costPrice + "and Selling Price is INR " + sellingPrice +
                " \n" + "The Profit is INR " + profit + " and the Profit Percentage is "
                + ((float) profit / costPrice) * 100;
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(profitCalc(129, 191));

    }
}
