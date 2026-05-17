import java.util.Scanner;

public class ArrayCreation{
    public static void main(String args[]){
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Phy"+marks[0]);
        System.out.println("Che"+marks[1]);
        System.out.println("Maths"+marks[2]);

        marks[1]=40;
        System.out.println("Che"+marks[1]);
        marks[2]=marks[2]+5;
        System.out.println("Maths"+marks[2]);

        System.out.print("Array Size is:"+marks.length);


    }
}