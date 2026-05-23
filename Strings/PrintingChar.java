public class PrintingChar {

    public static void printingchar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String str="Sainath";
        printingchar(str);
    }
}