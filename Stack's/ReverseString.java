import java.util.*;
public class ReverseString {

    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()) {
            char Curr=s.pop();
            result.append(Curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="Sainath";
        System.out.println(revString(str));
    }
}
