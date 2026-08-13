public class ClassandObject {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setTip(10);
        p1.setColor("Pink");
        System.out.println(p1.Color);
    }
}

class Pen{
    int Tip;
    String Color;

    void setTip(int newTip){
        Tip=newTip;
    }

    void setColor(String newColor){
        Color=newColor;
    }
}
