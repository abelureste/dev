public class buyAndSellStock {
    public static void main(String[] args) {
        int[] array = {10,1,5,6,7,1};

        System.out.println(maxProfit(array));
        System.out.println(maxProfit2Pointers(array));
        
    }

    public static int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minBuy = prices[0];

        for(int i : prices){
            maxPrice = Math.max(maxPrice, i - minBuy);
            minBuy = Math.min(minBuy, i);
        }

        return maxPrice;
    }

    public static int maxProfit2Pointers(int[] prices){
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
