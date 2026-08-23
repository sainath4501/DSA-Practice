import java.util.Arrays;
public class shallowcopy {

    public static void main(String[] args) {
        int []marks={10,30,50,70,90,60};
        Student s1=new Student(marks, "Sainath");

        //shallowCopy
        Student s2=new Student(s1.marks,s1.Name);
        s2.marks[2]=79;

        System.out.println(Arrays.toString(s1.marks));
        System.out.println(Arrays.toString(s2.marks));
    }
    static class Student{
        int []marks;
        String Name;

        Student(int []marks,String Name){
            this.marks=marks;
            this.Name=Name;

        }
    }


}