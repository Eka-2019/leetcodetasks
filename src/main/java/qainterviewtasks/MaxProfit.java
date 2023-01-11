package qainterviewtasks;

public class MaxProfit {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different
     * day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * <p>
     * Constraints:
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     */
    public int maxProfit(int[] prices) {
        int tempProfit = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                tempProfit = prices[j] - prices[i];
                if (maxProfit < tempProfit) {
                    maxProfit = tempProfit;
                }
            }
        }
        return maxProfit;
    }
}
