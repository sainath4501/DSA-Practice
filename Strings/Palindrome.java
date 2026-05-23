public class Palindrome {
     
    public static boolean palidrom(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)==str.charAt(n-1-i)){
                System.out.println("Given Word is Palindrom");
                return true;
            }
        }
        System.out.println("Given Word is Not Palindrom");
        return false;
    }

    public static void main(String args[]){
        String str="RACCAR";
        palidrom(str);
    }
}
