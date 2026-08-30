public class OptimizePow {

    public static int Optimize(int a, int n){

        if(n==0){
            return 1;
        }

        int half=Optimize(a, n/2)*Optimize(a, n/2);

        //if num is Odd

        if(n % 2 != 0){
            half = a * half;
        }
        return half;
    }

    public static void main(String[] args) {
        System.out.println(Optimize(2, 5));
        
    }
}