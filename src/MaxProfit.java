// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve

public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = {7,1,3,2,4,9,4};
        System.out.println(maxProfit.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int minValue = prices[0];
        int diff = 0;
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            // time for selling consideration
            if (prices[i - 1] < prices[i]) {
                diff = Math.max(diff, prices[i] - minValue);
            // time at decresing trends set minValue find result based on diff cal
            } else {
                minValue = prices[i];
                result += diff;
                diff = 0;
            }
        }

        return result + diff;
    }
}
