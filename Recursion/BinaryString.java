public class BinaryString {

    public static void BString(int n,int lastDigit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        BString(n-1, 0, str+"0");

        if(lastDigit==0){
            BString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        BString(4, 0, "");
    }
}