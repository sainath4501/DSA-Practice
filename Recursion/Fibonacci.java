public class Fibonacci {

    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int FNM1=Fib(n-1);
        int FNM2=Fib(n-2);
        int FN=FNM2+FNM1;
        return FN;
    }
    public static void main(String[] args) {
        int FIB=Fib(5);
        System.out.println("Fibonacci is :"+FIB);
    }
}
