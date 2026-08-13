public class getter{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Pink");
        System.out.println(p1.getColor());

        p1.setTip(2);
        System.out.println(p1.getTip());

    }
}

class Pen{
    private int Tip;
    private String Color;
    
    void setTip(int newTip){
        this.Tip=newTip;
    }

    void setColor(String newColor){
        this.Color=newColor;
    }

    int getTip(){
        return this.Tip;
    }

    String getColor(){
        return this.Color;
    }

}