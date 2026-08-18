import java.util.Scanner;

public class SumNaturalNo {

    public static int SUMN(int n){
        if(n==1){
            return 1;
        }
        int Sum=SUMN(n-1);
        int S1=n+Sum;
        return S1;

    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int SN=SUMN(n);
        System.out.println("Sum all natural number is:"+SN);
    }
}
