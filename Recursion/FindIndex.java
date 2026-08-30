public class FindIndex {

    public static void Index(int arr[],int key,int idx){

        //baseCase
        if(idx==arr.length){
            return;
        }

        if(arr[idx]==key){
            System.out.print(idx+" ");
        }

        Index(arr, key, idx+1);
    }
    
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        Index(arr, 2, 0);
        System.out.println();
    }
}
