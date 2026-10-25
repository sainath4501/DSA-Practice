import java.util.*;
public class pushAtBottom {

    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
        return;
    }
    
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        pushAtbottom(s, 40);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
