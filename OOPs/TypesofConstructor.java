public class TypesofConstructor {

    public static void main(String args[]){
        Student s1=new Student("Sai");
        Student s2=new Student(25);
        System.out.println(s1.name);
        System.out.println(s2.age);
    }
}

class Student{
    String name;
    int age;

    Student(int newage){
        this.age=newage;
    }

    Student(String  newname){
        this.name=newname;
    }
}