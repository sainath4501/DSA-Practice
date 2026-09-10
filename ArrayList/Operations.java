import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList <Integer> List = new ArrayList<>();
        //add
        List.add(10);
        List.add(16);
        List.add(20);
        List.add(26);
        System.out.println(List);

        //get
        int value=List.get(1);
        System.out.println(value);

        //remove
        List.remove(2);
        System.out.println(List);

        //set
        List.set(1, 100);
        System.out.println(List);

        //size
        int size=List.size();
        System.out.println(size);

        //conatin

        System.out.println(List.contains(26));

        //print
        System.out.println("Printing: ");
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }

    }
}
