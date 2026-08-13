public class Inheritance{
    public static void main(String args[]){
        Animal a1=new Animal();
        Dog d1=new Dog();
        d1.eat();
    }
}

class Animal{
    String Color;

    void eat(){
        System.out.println("Animal eat a food");
    }
}
class Dog extends Animal{
    String Sound;

    void setSound(){
        System.out.println("Bow...");
    }
}

