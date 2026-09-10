import java.util.ArrayList;
import java.util.List;

public class swap {

    public static void swaparray(ArrayList <Integer> num,int idx1,int idx4) {
        int temp=num.get(idx1);
        num.set(idx1, num.get(idx4));
        num.set(idx4, temp);
    }
    
    public static void main(String[] args) {
        ArrayList < Integer > num=new ArrayList<>();

        num.add(5); //0
        num.add(2); //1
        num.add(9); //2
        num.add(1); //3
        num.add(6); //4
        num.add(7); //5

        int idx1=1;
        int idx4=4;

        System.out.println(num);
        swaparray(num, idx1, idx4);
        System.out.println(num);
    }
}
