import java.util.Scanner;

public class RealNoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary parts of first number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter real and imaginary parts of second number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Img s1 = new Img(r1, i1);
        Img s2 = new Img(r2, i2);

        s1.calPro(s2);
        s1.calPro(s2);

        

    }

    static class Img {
        
        int real;
        int img;

        Img(int r,int i){
            this.real=r;
            this.img=i;
        }

        void setCal(Img s){
            System.out.println("Sum ="+(real+s.real)+ " + " + (img +s.img)+"i");
        }

         void calPro(Img s){
                System.out.println("Product = " + (real * s.real - img * s.img)
                    + " + " + (real * s.img + img * s.real) + "i");
        }
        
    }
}
