public class FirstOcurence {

    public static int First(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return First(arr, key, i+1);
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,5,4};
        System.out.println(First(num, 5, 0));
    }
}