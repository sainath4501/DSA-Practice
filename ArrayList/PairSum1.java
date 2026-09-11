import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairSum1(ArrayList <Integer> num,int Target){
        for(int i=0;i<num.size();i++){
            for(int j=0;j<num.size();j++){
                if(num.get(i)+num.get(j)==Target){
                    return true;
                }
            }
        }
        return false;
    }
   public static void main(String[] args) {
     ArrayList <Integer> num=new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        int Target=5;
        System.out.println(pairSum1(num, Target));
   }
}
