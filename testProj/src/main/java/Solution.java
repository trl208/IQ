/**
 * Rajyalaxmi_Thumarada on 28-03-2023
 */
class Solution {
    public static void main(String args[]) {

       // int[] arr = {7,1,5,3,6,4};

        int[] arr = { 3,2,6,5,0,3};

        System.out.println("max profit ::" + maxProfit(arr));


    }

    public static int maxProfit(int[] prices) {
        //if(prices[0])
        int minPrice = prices[0];
        int minPriceIndex = 0;
        int maxPrice = 0;
        int profit = 0;
        for(int i=1; i<prices.length-1; i++) {
            if( prices[i] !=0 && minPrice > prices[i] && i!=(prices.length-1 )) {
                // if(prices[i] != 0) {
                minPrice = prices[i];
                minPriceIndex = i;
                // }
            }
        }
        // System.out.println("minPriceIndex::" + minPriceIndex);
        if(minPriceIndex < prices.length ) {


            for(int j = minPriceIndex+1; j<prices.length; j++) {
                if(maxPrice < prices[j] ) {
                    maxPrice = prices[j];
                }
            }
            //System.out.println("MaxPrice:::" + maxPrice);
            if(maxPrice>minPrice)
                profit = maxPrice - minPrice;
        }
        return profit;
    }
}