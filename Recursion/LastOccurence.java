public class LastOccurence {

    public static int LastOcure(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastOcure(arr, key, i+1);

        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,9,7,8,7,5,8,7,5,8};
        System.out.println(LastOcure(arr, 7, 0));
    }
}
