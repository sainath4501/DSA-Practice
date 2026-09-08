public class StringSubset {
    public static void Subset(String str,String newstr,int i){

        //Base Case
        if(i==str.length()){
            if(newstr.length()==0){
                System.out.println("null");
            }else{
                System.out.print(newstr+" ");
            }
            return;
        }

        //if Yes
        Subset(str, newstr+str.charAt(i), i+1);

        //if No
        Subset(str, newstr, i+1);


    }
    public static void main(String[] args) {
        String str="ABC";
        Subset(str, "", 0);
    }
}