public class ClassandObject{

    public static void main(String asrgs[]){
        Pen p1=new Pen();
        p1.setColor("Pink");
        p1.setTip(50);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        
    }
}

class Pen{

    int tip;
    String color;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }


}