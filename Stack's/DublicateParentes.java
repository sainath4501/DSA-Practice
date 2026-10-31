import java.util.*;

public class DublicateParentes {

    public static boolean isDublicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if(count == 0){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1="(A+B)";
        String str2="((A+B))";
        System.out.println(isDublicate(str1));
    }
}