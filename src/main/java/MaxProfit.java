//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
//https://www.youtube.com/watch?v=76-CYD0jn7s
//https://www.youtube.com/watch?v=mj7N8pLCJ6w&list=PLi9RQVmJD2fYckvJZSKA4YcUQ4eyNupuY&index=3
public class MaxProfit {
//    public int maxProfit(int[] prices) {
//        int profit =0;
//        int maxProfit=0;
//        for(int i=0;i<=prices.length-2;i++)
//        {
//            for(int j=i+1;j<prices.length;j++)
//            {
//                profit = prices[j]-prices[i];
//                maxProfit = Math.max(profit,maxProfit);
//            }
//        }
//        return maxProfit;
//    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
