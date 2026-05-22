public class BinarySearch {

    public static int Binary(int number[],int Key){
        int start=0,end=number.length-1;

        while (start<=end) {
            int mid=(start+end)/2;

            if(number[mid]==Key){
                return mid;
            }

            //If element not found in mid Search Left or Right
            if(number[mid]<Key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return -1;
    }

    public static void main(String args[]){
        int number[]={10,20,30,40,50,60,70,80,90,100};
        int Key=90;

        int index=Binary(number, Key);
        if(index==-1){
            System.out.println("Element Not Fount...!");
        }else{
            System.out.println("Element Index number is :"+index);
        }
    }
}