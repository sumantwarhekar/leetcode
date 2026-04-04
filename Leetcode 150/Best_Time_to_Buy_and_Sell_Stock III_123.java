class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;

        int first_buy = Integer.MIN_VALUE, second_buy = Integer.MIN_VALUE;
        int first_sell = 0, second_sell = 0;

        for(int i=0; i<prices.length; i++){
            first_buy = Math.max(first_buy, -prices[i]);
            first_sell = Math.max(first_sell, first_buy + prices[i]);

            second_buy = Math.max(second_buy, first_sell - prices[i]);
            second_sell = Math.max(second_sell, second_buy + prices[i]);
        }

        return second_sell;
    }
}