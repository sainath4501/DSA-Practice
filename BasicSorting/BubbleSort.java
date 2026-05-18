public class BubbleSort {

    public static void bubblesort(int number[]){
       
        for(int turn=0;turn<number.length-1;turn++){
             int swap=0;
            for(int j=0;j<number.length-1-turn;j++){
                if(number[j] > number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                    swap++;
                }
            }
            System.out.println("No-of swaps in iteration "+(turn+1)+": "+swap);
        }
        
        
    }
    
    public static void main(String args[]){
        int number[]={5,9,7,6,4,3,1,6};
        bubblesort(number);

        //printing
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }


    }
}
