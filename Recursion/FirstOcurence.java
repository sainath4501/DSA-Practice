public class FirstOcurence {

    public static int FirstOcure(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcure(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9,4,5};
        System.out.println(FirstOcure(arr, 4, 0));
    }
}
