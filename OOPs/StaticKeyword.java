public class StaticKeyword {
    public static void main(String args[]){
        Student s1=new Student();
        s1.setRollNo(4);
         Student s2=new Student();
        s1.School="JSVK";
        System.out.println(s1.getRollNo());
        System.out.println(s2.School);
    }
}

class Student{
    int RollNo;
    String Name;
    static String School;

    void setSchool(String newSchool){
        this.School=newSchool;
    }


    void setRollNo(int newRoll){
        this.RollNo=newRoll;
    }
    
    int getRollNo(){
        return this.RollNo;
    }
}
