public class TrappedWater {

    public static int trappedwater(int height[]){

        int n=height.length;
        
        int left[]=new int[n];
        left[0]=height[0];

        //calculate left max boundry
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i], left[i-1]);
        }

        int right[]=new int[n];
        right[n-1]=height[n-1];

        //calculate rigth max boundry
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i], right[i+1]);
        }

        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(left[i], right[i]);
            trappedWater+=waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int TRPW=trappedwater(height);
        System.out.print("Traped Water is: "+TRPW);
    }
}