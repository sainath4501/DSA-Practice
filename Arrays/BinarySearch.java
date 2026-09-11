public class BinarySearch {

    public static int Binary(int number[],int key){
        int start=0;
        int end=number.length-1;

        while (start<=end) {
            int mid=(start+end)/2;

            // if mid equal to key check once
            if(number[mid]==key){
                return mid;
            }

            //if key not found in mid, check once left and right

            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={10,20,30,50,60,80,90,100};
        int key=90;
        int Index=Binary(number, key);

        if(Index == -1){
            System.out.println("You Serached Value not Found in Array.....!");
        }else{
            System.out.println("Value Found at index: "+Index);
        }
    }
}