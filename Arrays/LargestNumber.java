public class LargestNumber {

    public static int Largest(int number[]){
        int Large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(Large<number[i]){
                Large=number[i];
            }
        }
        return Large;
    }

    public static int Smallest(int number[]){
        int Small=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Small>number[i]){
                Small=number[i];
            }
        }
        return Small;
    }

    public static void main(String args[]){
        int number[]={10,20,40,90,20,35};
        System.out.println(Largest(number));
        System.out.println(Smallest(number));
    }
}