//Use Following Sorting Algorithm to Sort an Array in Descending Order

public class SortingHomeWork {

    //Bubble Sort
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            System.out.println("Number of Swap per iteration"+swap);
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[min] < arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        
    }

    //Insertion Sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;

        }
        
    }

    public static void countingSort(int arr[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            Largest=Math.max(Largest, arr[i]);
        }

        int count[]=new int[Largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String args[]){
        int arr[]={3,6,2,8,7,4,5,1};
        // bubbleSort(arr);
        // insertionSort(arr);
        countingSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
