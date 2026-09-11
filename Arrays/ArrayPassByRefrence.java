public class ArrayPassByRefrence {

    public static void PassByRefrence(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] * 10;
        }
    }

    public static void main(String[] args) {
        int marks[]={10,20,30,40,50,60};

        PassByRefrence( marks);

        //print

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}