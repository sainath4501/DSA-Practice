public class BuyingSellStock {

    public static int buyingselling(int Price[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<Price.length;i++){
            if(buyingPrice<Price[i]){
                int profit=Price[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyingPrice=Price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int Price[]={7,1,5,3,6,4};
        int Stock=buyingselling(Price);
        System.out.println("Hihest Prifit day is:"+Stock);

    }
}