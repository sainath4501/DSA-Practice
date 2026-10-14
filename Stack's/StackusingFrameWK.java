import java.util.*;

public class StackusingFrameWK {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.add(10);
        s.add(20);
        s.add(30);

        while (!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
            
        }
    }
}