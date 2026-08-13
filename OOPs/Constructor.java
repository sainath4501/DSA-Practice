public class Constructor{
    public static void main(String args[]){
        Student s1=new Student("Sainth");
        System.out.println(s1.Name);
        
    }
}

class Student{
    
    String Name;
    int RollNo;
    
    Student(String newName){
        this.Name=newName;
    }

    Student(int newRollno){
        this.RollNo=newRollno;
    }



    // Student(){
        // System.out.println("Sainath.....");
           
    
}