public class MaxSubArraySum {
    
    public static void max(int number[]){
        int tms=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                int curSum=0;
                for(int k=i;k<=j;k++){
                    curSum+=number[k];
                }
                tms++;
                System.out.print(curSum+" ");
                if(MaxSum < curSum){
                    MaxSum=curSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum is: "+MaxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        max(number);
    }
}