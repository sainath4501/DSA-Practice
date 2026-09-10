import java.util.*;

public class Sorting {
    
    public static void main(String[] args) {
        
        ArrayList < Integer > num=new ArrayList<>();

        num.add(5);
        num.add(2);
        num.add(9);
        num.add(1);
        num.add(6);
        num.add(7);

        System.out.println(num);

        Collections.sort(num);

        System.out.println("After Sorting in Ascending :"+num);

        Collections.sort(num,Collections.reverseOrder());

        System.out.println("After Sorting in Desc: "+num);
    }
}
