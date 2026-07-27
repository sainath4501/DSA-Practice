public class Constructor{
    public static void main(String args[]){
        Student s=new Student("Sainathh");
        System.out.println(s.name);
    }
}

class Student{
    
    int RollNo;
    String name;
    Student(String newname){
        this.name=newname;
    }
    Student(){
        System.out.println("Sainath.....");
        
        

    }
    
}