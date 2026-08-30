public class XpowerN {

    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int N1=pow(x,n-1);
        int N2=x*N1;
        return N2;

    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        
    }
}