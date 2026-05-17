public class ReverseArray {

    public static void Reverse(int number[]){
        int start=0,end=number.length-1;
        while (start<end) {

            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;

            start++;
            end--;
            
        }
    }
    public static void main(String args[]){
        int number[]={10,20,30,40,50,60,70,80,90,100};
        
        Reverse(number);
        
        //For Printing 
         System.out.println("Reverse Array is :");
        for(int i=0;i<number.length;i++){
           System.out.print(number[i]+" ");
        }
    }
}