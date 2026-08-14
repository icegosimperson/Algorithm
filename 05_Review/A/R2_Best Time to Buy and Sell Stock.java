class R2_Best Time to Buy and Sell Stock {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int maxPrice = prices[prices.length-1];
        for(int j=prices.length-2; j>=0; j--){
            if(maxPrice<prices[j]){
                maxPrice = prices[j];
            }
            maxProfit = Math.max(maxPrice-prices[j], maxProfit);
        }
        return maxProfit;
    }
}