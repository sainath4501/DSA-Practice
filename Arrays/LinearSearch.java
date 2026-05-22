public class LinearSearch {

    public static int Linear(int number[],int Key){
        for(int i=0;i<number.length;i++){
            if(number[i]==Key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={10,20,30,60,70,50,60,40};
        int Key=60;

        int index=Linear(number, Key);
        if(index==-1){
            System.out.println("Searched Value Not Found...!");
        }else{
            System.out.println("Key Index Number is :"+index);
        }
    }
}