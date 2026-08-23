public class Super {
   public static void main(String[] args) {
        Super s =new Super();
        Child c1=s.new Child();
        System.out.println(c1.Color);
   } 

    class Parent{
        String Color="Pink";
    Parent(){
        System.out.println("Parent constructor calling......");
    }
   }

    class Child extends Parent{
     Child(){
        super.Color="black";
        System.out.println("Child Constructor Calling.....");
    }
   }
}
