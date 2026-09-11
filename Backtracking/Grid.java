public class Grid {
    
    public static int grid(int i,int j, int m,int n){

        if(i==m-1 || j==n-1){
            return 1;
        }

        if(i==m && j== n){
            return 0;
        }
        int way1=grid(i+1, j, m, n);
        int way2=grid(i, j+1, m, n);

        int totalWay=way1+way2;

        return totalWay;

    }
    public static void main(String[] args) {
        int totalWays=grid(0, 0, 3, 3);
        System.out.println("Total ways to reach Destination: "+ totalWays);
    }
}
