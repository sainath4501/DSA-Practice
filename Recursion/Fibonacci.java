public class Fibonacci {

    public static int Fib(int n){
        if(n==0||n==1){
            return n;
        }
        int n1=Fib(n-1);
        int n2=Fib(n-2);
        int N=n2+n1;
        return N;
    }
    public static void main(String[] args) {
        int FIB=Fib(6);
        System.out.println("Fibonacci is :"+FIB);
    }
}
