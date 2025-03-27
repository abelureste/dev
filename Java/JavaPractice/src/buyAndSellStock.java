public class buyAndSellStock {
    public static void main(String[] args) {
        int[] array = {10,1,5,6,7,1};

        System.out.println(maxProfitBruteForce(array));
        System.out.println(maxProfitDynamicProgramming(array));
        System.out.println(maxProfit2Pointers(array));
        
    }

    public static int maxProfitBruteForce(int[] prices) {
        int result = 0;
        for(int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                result = Math.max(result, sell - buy);
            }
        }
        return result;
    }

    public static int maxProfitDynamicProgramming(int[] prices) {
        int maxPrice = 0;
        int minBuy = prices[0];

        for(int i : prices){
            maxPrice = Math.max(maxPrice, i - minBuy);
            minBuy = Math.min(minBuy, i);
        }

        return maxPrice;
    }

    public static int maxProfit2Pointers(int[] prices) {
        int left = 0, right = 0;
        int maxPrice = 0;

        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxPrice = Math.max(maxPrice, profit);
            } else {
                left = right;
            }
            right += 1;
        }

        return maxPrice;
    }
}
