public class ArrayBK {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[],int val,int i){
        if(i==arr.length){
            printArray(arr);
            return;
        }

        arr[i]=val;
        changeArr(arr, val+1, i+1);
        arr[i]=arr[i]-2;
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr, 1, 0);
        printArray(arr);
    }
}

