package Revision.Arrays;


public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int pro = 0;
        int n = prices.length;
        for(int i =0;i<n;i++){
            min = Math.min(min,prices[i]);
            pro = Math.max(pro,prices[i]-min);
        }
        return pro;

    }
}
