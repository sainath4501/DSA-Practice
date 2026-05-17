public class ArrayPassByRefrence {

    public static void PassByRefrence(int number[]){
        for(int i=0;i<number.length;i++){
            number[i]=number[i]*10;
        }
    }

    public static void main(String args[]){
        int number[]={10,20,30,40,60,70,80,90,100};
        PassByRefrence(number);

        //printing
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}