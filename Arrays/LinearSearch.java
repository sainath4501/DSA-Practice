public class LinearSearch {

    public static int Linear(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        int key=4;
        int Index=Linear(number, key);
        if(Index == -1){
            System.out.println("Element not Found in Searched Array...!");
        }else{
            System.out.println("Element Found at index :"+Index);
        }
    }
}