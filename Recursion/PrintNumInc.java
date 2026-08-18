public class PrintNumInc {
    public static void PrintIn(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIn(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        PrintIn(5);
    }
}
