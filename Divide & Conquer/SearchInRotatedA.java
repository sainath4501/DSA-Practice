public class SearchInRotatedA {

    public static int searchA(int arr[],int tar,int si,int end){

        if(si>end){
            return -1;
        }
        int mid=(si+end)/2;

        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si]<= tar && tar <= arr[mid]){
                return searchA(arr, tar, si, mid-1);
            }else{
                return searchA(arr, tar, mid+1, end);
            }
        }else{
            if(arr[mid] <= tar &&  tar <= arr[end]){
                return searchA(arr, tar, mid+1, end);
            }else{
                return searchA(arr, tar, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchA(arr, 0, 0, arr.length-1));
    }
}