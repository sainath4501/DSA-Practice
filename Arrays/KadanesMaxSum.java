public class KadanesMaxSum {

    public static void kadans(int number[]){
        int MaxSum=0;
        int curSum=0;
        for(int i=0;i<number.length;i++){
            curSum+=number[i];
            if(curSum < 0){
                curSum=0;
            }
            MaxSum=Math.max(MaxSum, curSum);
        }
        System.out.println("Max sum is "+MaxSum);
    }

    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        kadans(number);
    }
}