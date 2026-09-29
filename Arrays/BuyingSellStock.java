public class BuyingSellStock {

    public static int BuySell(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int Profit=price[i]-buyPrice;
                maxProfit=Math.max(maxProfit, Profit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }


    public static void main(String args[]){
        int Price[]={7,1,5,3,6,4};
        int Stock=BuySell(Price);
        System.out.println("Highest Profit is:"+Stock);

    }
}