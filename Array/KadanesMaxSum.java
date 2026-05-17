public class KadanesMaxSum {

    public static void Kadanes(int number[]){
        int MaxSum=0;
        int currSum=0;
        for(int i=0;i<number.length;i++){
            currSum=currSum+number[i];
            if(currSum < 0){
                currSum=0;
            }
            MaxSum=Math.max(MaxSum, currSum);
        }
        System.out.println("Max Sum is:"+MaxSum);
    }
    public static void main(String args[]){
        int number[]={-2,-3,4,-1,-2,1,5};
        Kadanes(number);

    }
    
}
