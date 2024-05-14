package Blind75;

public class BestTimeToBuyAnsSellStocks {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if(prices[i]-min>profit){
                profit = Math.max(prices[i]-min,profit);
            }
        }
        return profit;

    }
}
