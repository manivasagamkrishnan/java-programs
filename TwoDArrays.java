package com.techatpark.practices.basics;

public class TwoDArrays {
    public static int profit(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
         
            if (price[i] < buyPrice) {
                buyPrice = price[i];
            } else {
                // Calculate profit if we sell at the current price
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {8, 9, 0, 4, 6, 3};
        System.out.println("Profit: " + profit(price));
    }
}
