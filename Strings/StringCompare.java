public class StringCompare {

    public static void main(String args[]){
        String str1="Sainath";
        String str2="Sainath";
        String str3=new String("Sainath");
        String str4=new String("Sainath");

        //Comparing with == operator
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str3==str4); //false

        //Comparing with equals() method
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str3.equals(str4)); //true
    }
    
}
