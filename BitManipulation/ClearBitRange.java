public class ClearBitRange {
    
    public static int clearbitrange(int n,int i,int j){
        int A=((~0)<<(j+1));
        int B=(1<<i)-1;

        int Bitmass=A|B;
        return n & Bitmass;
    }

    public static void main(String args[]){
        System.out.println(clearbitrange(10, 2, 7));
    }
}
