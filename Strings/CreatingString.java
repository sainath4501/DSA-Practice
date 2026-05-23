import java.util.Scanner;

public class CreatingString{
    public static void main(String args[]){
        String str="ABCD";

        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("name :"+str1);

        //find out a length of String

        String Name="Sainath";
        System.out.println(Name.length());

        //Concatinate
        String FirstName="Sainath";
        String LastName="Kouji";
        String FullName=(FirstName+" "+LastName);
        System.out.println(FullName);
        System.out.println(FullName.charAt(1));
    }
}