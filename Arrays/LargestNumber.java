public class LargestNumber {

    public static int LargestNo(int number[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
        }
        return Largest;
    }

     public static int SmallestNo(int number[]){
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        return Smallest;
    }

    public static void main(String args[]){
        int number[]={10,20,30,40,50,60};

        int Largest=LargestNo(number);
        int Smallest=SmallestNo(number);
        System.out.println("Smallest Number is :"+Smallest);
        System.out.print("Largest Number is :"+Largest);

    }
}