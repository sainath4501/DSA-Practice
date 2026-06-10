public class HybridInheritance {
        
    public class MultiLevelInheritance {

    public static void main(String args[]){
        BMW m1=new BMW();
        m1.Work();
    }
    
    static class vehical{
        String Cars;

        void Work(){
            System.out.println("Run's on Road....!");
        }
    }

    static class MGCars extends vehical{
        String Cars;

        void Brand(){
            System.out.println("Top Brand in India");
        }
    }

    static class BMW extends vehical{
        String Model;

        void Fetures(){
            System.out.println("Provide a luxury Features");
        }
    }
}    

}
