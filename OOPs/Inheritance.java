public class Inheritance {
    
    public static void main(String args[]){
        cat c1=new cat();
        c1.eat();
    }

    static class Animal{
        String Color;
        void eat(){
            System.out.println("Eat's");
        }
    }

    static class cat extends Animal{
        int leg;
        void speak(){
            System.out.println("Bow");
        }
    }
}

