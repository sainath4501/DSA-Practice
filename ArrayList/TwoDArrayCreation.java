import java.util.ArrayList;

public class TwoDArrayCreation {

    public static void main(String[] args) {
        
        ArrayList <ArrayList<Integer>> mainArray =new ArrayList<>(); 

        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        ArrayList <Integer> List3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }

        mainArray.add(List1);
        mainArray.add(List2);
        mainArray.add(List3);
        System.out.println(mainArray);

        for(int i=0;i<mainArray.size();i++){
            ArrayList <Integer > curArrayList=mainArray.get(i);
            for(int j=0;j<curArrayList.size();j++){
                System.out.print(curArrayList.get(j)+" ");
            }
            System.out.println();
        }
    }
}