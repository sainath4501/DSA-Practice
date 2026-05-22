public class PairPring{

    public static void PPrinting(int number[]){
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int number[]={2,4,6,7,8,10,12,14,16};
        PPrinting(number);

    }
}