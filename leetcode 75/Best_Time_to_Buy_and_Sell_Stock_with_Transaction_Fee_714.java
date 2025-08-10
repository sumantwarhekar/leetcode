class Solution {                                                        // https://www.youtube.com/watch?v=yN5K5T3aw8M
    public int maxProfit(int[] prices, int fee) {                       // https://www.youtube.com/watch?v=k4eK-vEmnKg
        int n = prices.length;
        
        int aheadNotBuy=0, aheadBuy=0;
        int curNotBuy, curBuy;

        for(int i=n-1;i>=0;i--){
            curNotBuy = Math.max(prices[i] + aheadBuy, aheadNotBuy );
            curBuy = Math.max(-prices[i] - fee + aheadNotBuy, aheadBuy);

            aheadBuy = curBuy;
            aheadNotBuy = curNotBuy;
        }
        return aheadBuy;
    }
}