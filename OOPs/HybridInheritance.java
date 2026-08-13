public class HybridInheritance {
    public static void main(String args[]){
        BMW m1=new BMW();
        m1.Work();

        MGCars m2=new MGCars();
        m2.Work();
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


