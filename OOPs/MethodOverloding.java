public class MethodOverloding{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(2,5   ));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a*b;
    }
}
