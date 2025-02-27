class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minpr=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            int cost=prices[i]-minpr;
            profit=Math.max(cost,profit);
            minpr=Math.min(minpr,prices[i]);
        }
        return profit;
        
    }
}