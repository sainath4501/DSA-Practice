public class StringSubset {

    public static void SubSet(String str, String val,int i ){

        if(i==str.length()){
            if(val.length()==0){
                System.out.println("Null");
            }else{
                System.out.println(val);
            }
            return;
        }
        // if yes
        SubSet(str, val+str.charAt(i), i+1);

        // if no
        SubSet(str, val, i+1);
    }

    public static void main(String[] args) {
        String str="abc";
        SubSet(str, " ", 0);
    }
    
}
