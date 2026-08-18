public class PrintNumber {
    public static void Print1to10(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        Print1to10(n-1);
    }
    public static void main(String[] args) {
        Print1to10(10);
    }
}