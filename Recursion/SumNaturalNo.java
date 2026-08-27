import java.util.Scanner;

public class SumNaturalNo {

    public static int SUMN(int n){
        if (n==0) {
            return n;
            
        }
        int S1=SUMN(n-1);
        int S2=n+S1;
        return S2;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int SN=SUMN(n);
        System.out.println("Sum all natural number is:"+SN);
    }
}
