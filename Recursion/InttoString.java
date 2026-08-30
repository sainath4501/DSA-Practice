public class InttoString {
    
    static String digit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void Int2String(int number){
        String digit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        if(number==0){
            return;
        }

        int lastDight=number % 10;
        Int2String(number/10);
        System.out.print(digit[lastDight]+" ");
    }
    public static void main(String[] args) {
        Int2String(2001);
        System.out.println();
    }
}
