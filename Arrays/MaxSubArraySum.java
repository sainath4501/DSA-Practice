public class MaxSubArraySum {

    public static void MSAS(int number[]){
        int Largest=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<number.length;i++){
           
            for(int j=i;j<number.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=number[k];
                }
                System.out.print(currSum);
                if(Largest<currSum){
                    Largest=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Largest Number is :"+Largest);
    }

    public static void main(String args[]){
        int number[]={1,-2,6,-1,3};
        MSAS(number);
    }
}