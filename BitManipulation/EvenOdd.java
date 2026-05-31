public class EvenOdd {
    public static void Eo(int n){
        int bitmas=1;
        if((n & bitmas)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        Eo(5);
    }
}
