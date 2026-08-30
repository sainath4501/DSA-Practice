public class Tilling {

    public static int Till(int n){

        if(n ==0 || n==1){
            return 1;
        }
        //vertical
        int NM1=Till(n-1);

        //Horiztal

        int NM2=Till(n-2);

        int totalWy=NM1+NM2;

        return totalWy;
    }
    
    public static void main(String[] args) {
        System.out.println(Till(3));   
    }
}
