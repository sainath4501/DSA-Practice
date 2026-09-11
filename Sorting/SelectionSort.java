public class SelectionSort {
    
    public static void selectionsort(int number[]){
        for(int i=0;i<number.length-1;i++){
            int min=i;
            for(int j=i+1;j<number.length;j++){
                if(number[min]>number[j]){
                    min=j;
                }
            }
            //Swap
            int temp=number[min];
            number[min]=number[i];
            number[i]=temp;
        }
    }
    public static void main(String args[]){
        int number[]={5,9,7,6,4,3,1};
        selectionsort(number);

        //printing
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }


    }
}
