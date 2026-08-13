
public class DeepCopy {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.Roll_no = 331;
        s1.Name = "Sainath";
        s1.Password = "SAI";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.Password = "SAI1";
        s2.marks[0] = 105;
        s2.marks[1] = 95;
        s2.marks[2] = 86;

        System.out.println(s2.Name);
        System.out.println(s2.Roll_no);
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);
        System.out.println(s1.Password);
        System.out.println(s2.Password);

    }
}

class Student {

    int Roll_no;
    String Name;
    String Password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("I am a student of PES University");
    }

    Student(Student s1) {
        marks = new int[3];
        this.Name = s1.Name;
        this.Roll_no = s1.Roll_no;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(int newROLLNo) {
        marks = new int[3];
        this.Roll_no = newROLLNo;
    }

    Student(String newName) {
        marks = new int[3];
        this.Name = newName;
    }
}
