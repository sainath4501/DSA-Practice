import java.util.ArrayList;

public class PairSum1Optimal {

    public static boolean pairSum(ArrayList <Integer> num,int Tar){
        int lp=0;
        int rp=num.size()-1;

        while (lp < rp) {

            if(num.get(lp)+num.get(rp)==Tar){
                return true;
            }

            if(num.get(lp)+num.get(rp)<Tar){
                lp++;
            }else{
                rp--;
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
        System.out.println(pairSum(num, Target));
    }
}
