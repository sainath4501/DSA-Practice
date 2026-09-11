import java.util.ArrayList;

public class TwoSum {

    public static Boolean twoSum(ArrayList <Integer> num,int target){

        int n=num.size();
        int bp=-1;

        for(int i=0;i<n;i++){
            if(num.get(i)>num.get(i+1)){
                bp=i;
                break;
            }

        }
        int rp=bp;
        int lp=bp+1;

        while (lp != rp) {
            
            if(num.get(lp)+num.get(rp)==target){
                return true;
            }
            if(num.get(lp)+num.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
            
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        
        ArrayList <Integer> num=new ArrayList<>();

        num.add(11);
        num.add(15);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(10);

        int Target=16;
        System.out.println(twoSum(num, Target));
    }
}
