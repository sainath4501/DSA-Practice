public class getter {
    public static void main(String args[]){
        Pen p=new Pen();
        p.setTip(50);
        p.setColor("Pink");
        System.out.println(p.getTip());
        System.out.println(p.getColor());
    }   
}
class Pen{
    private int tip;
    private String Color;

    void setTip(int newTip){
        tip=newTip;

    }
    void setColor(String newColor){
        Color=newColor;
    }

    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.Color;
    }
}