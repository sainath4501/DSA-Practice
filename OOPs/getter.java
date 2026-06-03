public class getter {

    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("black");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String Color;
    private int Tip;

    void setColor(String newColor){
        Color=newColor;
    }

    void setTip(int newTip){
        Tip=newTip;
    }

    String getColor(){
        return this.Color;
    }

    int getTip(){
        return this.Tip;
    }
}