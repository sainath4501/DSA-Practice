public class Factorial {

    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int F1=Fact(n-1);
        int F2=n*F1;
        return F2;
    }

    public static void main(String[] args) {
        System.out.println("Factorial is "+Fact(5));
    }
}