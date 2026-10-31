import java.util.*;

public class StackusingArrayList {

    static ArrayList<Integer> list=new ArrayList<>();

    public static boolean isEmpty(){
        return list.size()==0;
    }

    public static void push(int data){
        list.add(data);
        return ;
    }

    public static int  pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        return top;
    }

    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}