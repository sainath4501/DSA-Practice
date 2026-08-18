// public class Interface{
//     public static void main(String args[]){
//         Queen q1=new Queen();
//         q1.move();
//         King k1=new King();
//         k1.move();
//         k1.mate();
    
//     }
// }

// interface ChessPlayer{

//     void move();
// }

// interface Checkmate{
//     void mate();


// }

// class Queen implements ChessPlayer{
//     public void move(){
//         System.out.println("Queen can move all 4 direction and diagonal");
//     }
// }

// class King implements ChessPlayer,Checkmate{
//     public void move(){
//         System.out.println("King can move all 4 direction and diagonal");
//     }

//     public void mate(){
//         System.out.println("1 CheckMate");
//     }
// }



public class Interface {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(10);
        System.out.println(s1.setMarks(50));
    }
}

class Student {
    int marks;
    String name;

    int setMarks(int newMarks) {
        this.marks = newMarks;
        return this.marks;
    }

    Student(Student s) {
        this.marks = s.marks;
        this.name = s.name;
    }

}