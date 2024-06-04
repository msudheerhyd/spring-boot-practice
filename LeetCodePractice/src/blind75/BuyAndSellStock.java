package blind75;

public class BuyAndSellStock {

    public static int sellStock(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];

        for(int i=1; i<prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sellStock(prices));
    }
}
