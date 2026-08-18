public class Factorial {
    
    public static int Fact(int n){

        if(n==0){
            return 1;
        }
        int FNM1=Fact(n-1);
        int FN=n * FNM1;
        return FN;
    }
    public static void main(String[] args) {
        int FN=Fact(5);
        System.out.println("Factorial is "+FN);
    }
}
