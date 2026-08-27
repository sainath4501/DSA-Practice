public class LastOccurence {

    public static int Last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFoound =Last(arr, key, i+1);
        if(isFoound == -1 && arr[i]==key){
            return i;
        }
        return isFoound;
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,6,2,7};
        System.out.println(Last(num, 2, 0));
    }
}