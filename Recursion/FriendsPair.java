public class FriendsPair {

    public static int FriPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //He wants to stay single
        int NM1=FriPair(n-1);

        // //When he wants to pair
        int NM2=FriPair(n-2);

        int pairWays=(n-1)*NM2;

        int totalWays=pairWays + NM1;

        return totalWays;

        // return FriPair(n-1) + (n-1)*FriPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriPair(3));
    }
}