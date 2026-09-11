import java.util.ArrayList;

public class OptimalWaterContainer {

    public static int WaterContainer(ArrayList <Integer> height){
        int maxContainer=0;
        int lp=0;
        int rp=height.size()-1;

        while (lp < rp) {
            int hei=Math.min(height.get(lp),height.get(rp));
            int weight=rp-lp;
            int curWaterLevel=hei*weight;

            maxContainer=Math.max(maxContainer, curWaterLevel);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxContainer;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer>height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(WaterContainer(height));

    }
}
