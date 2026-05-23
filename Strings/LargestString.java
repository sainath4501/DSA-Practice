public class LargestString {
    
    public static void main(String args[]){

        String Fruit[]={"apple","mango","banana"};
        String Largest=Fruit[0];

        for(int i=1;i<Fruit.length;i++){
            if(Largest.compareTo(Fruit[i])<0){
                Largest=Fruit[i];
            }
        }
        System.out.println(Largest);
    }
}
