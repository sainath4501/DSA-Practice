public class MaxSumPrefix {

    public static void Prefix(int number[]){
        int Largest=Integer.MIN_VALUE;
        int currSum=0;

        int prefix[]=new int[number.length];
        prefix[0]=number[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currSum=(i==0) ? prefix[j] : prefix[j]-prefix[i-1];
                if(Largest<currSum){
                    Largest=currSum;
                }
            }
        }
        System.out.println("Max Sum is :"+Largest);

    }

    public static void main(String args[]){
        int number[]={1,-2,6,-1,3};
        Prefix(number);
    }
}