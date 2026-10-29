import java.util.*;
public class NextGreaterOptimal {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        
        Stack<Integer> s =new Stack<>();
        
        int nGE[]=new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nGE[i]=-1;
            }else{
                nGE[i]=arr[s.peek()];
            }
            s.push(i);
        }

        //to print
        for(int i=0;i<nGE.length;i++){
            System.out.print(nGE[i]+" ");
        }
        System.out.println();
    }
}
