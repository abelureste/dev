public class buyAndSellStock {
    public static void main(String[] args) {
        int[] array = {10,1,5,6,7,1};

        System.out.println(maxProfit(array));
        
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
}
