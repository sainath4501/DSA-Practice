public class Abstraction {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.walk();
        c1.eat();
        System.out.println(c1.color);
    }
}

abstract class animal{

    String color;
    void eat(){
        System.out.println("Animal eat a food");
    }
    animal(){
        color="brown";
    }
   abstract void walk();

}

class cat extends animal{
    void walk(){
        System.out.println("On 2 legs");
    }
    void changeColor(){
        color="darkbrown";
    }
}