import java.util.ArrayList;

public class StackusingArrayList {

    static public class Stack{
        static ArrayList<Integer>list=new ArrayList<>();

        //isEmpty to check
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //add
        public static void push(int data){
            list.add(data);
        }

        //remove
        public static int pop(){
            int val=list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        //peek
        public static int peek(){
            int val=list.get(list.size()-1);
            return val;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}