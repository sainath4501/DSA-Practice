public class SubArray {

    public static void SubA(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        int number[]={10,20,30,40,50,60,70,80};
        SubA(number);
    }
}