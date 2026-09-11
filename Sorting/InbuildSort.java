import java.util.Arrays;
import java.util.Collections;

public class InbuildSort{
     public static void main(String args[]){
        Integer number[]={5,9,7,6,4,3,1,6};
        // Arrays.sort(number);
        // Arrays.sort(number,0,3);
        Arrays.sort(number,Collections.reverseOrder());


        //printing
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }


    }
}