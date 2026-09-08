public class StringPermutation {

    public static void Permutation(String str, String ans){

        //Base Case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        

        for(int i=0;i<str.length();i++){
            char curCh=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            Permutation(newStr, ans+curCh);
        }
    }

    public static void main(String[] args) {
        String str="ABC";
        Permutation(str, "");
    }
}