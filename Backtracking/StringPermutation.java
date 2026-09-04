public class StringPermutation {
     
    public  static void FindStringPermitation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            FindStringPermitation(newstr, ans+curChar);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        FindStringPermitation(str, "");  
    }
}
