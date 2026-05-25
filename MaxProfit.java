public class MaxProfit {
    public static int maxProfit(int [] prices)
    int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int price : prices)
        {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                maxPro = Math.max(maxPro, price - minPrice );
            }
        }
       return maxPro;
        
    }
}
    

