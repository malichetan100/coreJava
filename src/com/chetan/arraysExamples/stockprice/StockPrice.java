package com.chetan.arraysExamples.stockprice;

public class StockPrice {
    public int findMaxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                if (maxProfit < prices[j] - prices[i])
                    maxProfit = prices[j] - prices[i];
            }
        }
        return maxProfit;
    }
}
