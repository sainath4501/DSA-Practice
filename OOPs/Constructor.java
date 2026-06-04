import java.util.jar.Attributes.Name;

public class Constructor{
    
    public static void main(String args[]){
        Student s1=new Student("Sainath");
        System.out.println(s1.name);

    }
}

class Student{
    
    String name;

    Student(String newName){ // THIS IS CONSTRUCTOR
        this.name=newName;
    }
}