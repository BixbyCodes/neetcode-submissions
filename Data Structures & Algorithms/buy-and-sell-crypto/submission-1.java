class Solution {
    public int maxProfit(int[] prices) {
        int cpp = 0;
        int profit = 0;
        int cp = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cp){
                cp = prices[i];
            }
            profit = prices[i]-cp;
            if(profit>cpp){
                cpp = profit;
            }
        }
        return cpp;
    }
}
