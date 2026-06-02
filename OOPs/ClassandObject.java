public class ClassandObject {

    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Black");
        System.out.println(p1.Color);    
    }
}

class Pen{
    String Color;
    int Tip;

    void setColor(String newColor){
        Color=newColor;
    }
}