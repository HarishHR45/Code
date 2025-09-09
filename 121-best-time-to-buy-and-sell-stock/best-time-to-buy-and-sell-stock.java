class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0, profit = 0;
        int least = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            profit = prices[i] - least;
            maxp = Math.max(maxp , profit);
        }
        return maxp;
    }
}