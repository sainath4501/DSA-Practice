public class Clearlast_ith_bit {
    
    public static int clearithnit(int n,int i){
        int bitmass=-1<<i;
        return n & bitmass;
    }
    public static void main(String args[]){
        System.out.println(clearithnit(15, 2));
    }
}
