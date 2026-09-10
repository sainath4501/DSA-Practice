import java.util.ArrayList;

public class MaxValue {
    
    public static void main(String[] args) {
        
        ArrayList < Integer > num=new ArrayList<>();

        num.add(5);
        num.add(2);
        num.add(9);
        num.add(1);
        num.add(6);
        num.add(7);
        
        int max=Integer.MIN_VALUE;

        for(int i=0;i<num.size();i++){
            if(max<num.get(i)){
                max=num.get(i);
            }
        }
        System.out.println(max);
    }
}
