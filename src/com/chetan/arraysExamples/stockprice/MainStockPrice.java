package com.chetan.arraysExamples.stockprice;

public class MainStockPrice {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 9};

        StockPrice stockPrice = new StockPrice();
        System.out.println(stockPrice.findMaxProfit(prices));
    }
}
