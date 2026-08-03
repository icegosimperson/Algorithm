class 121. Best Time to Buy and Sell Stock {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            } else{
                maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
/*
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int maxPrice=prices[prices.length-1];
        for(int j=prices.length-2; j>=0; j--){
            if(prices[j]<maxPrice){
                maxProfit=Math.max(maxProfit, maxPrice-prices[j]);
            } else{
                maxPrice = prices[j];
            }
        }
        return maxProfit;
    }
}
 */