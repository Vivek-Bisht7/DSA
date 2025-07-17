// Brute force = Generate all combinations using nested loops

// Optimised

class Solution {
    public int maxProfit(int[] prices) {
        //minimum element found till now
        int min = Integer.MAX_VALUE;
        //max reigistered profit 
        int result = 0;

        for(int i=0; i<prices.length; i++){
            //if today's price is minimum
            if(prices[i]<min){
                min = prices[i];
            }
            //if today's price is not minimum that means it is higher than that so just take out profit and compare it with max registered profit
            else{
                int profit = prices[i]-min;
                result = Math.max(profit,result);
            }
        }
        return result;
    }
}