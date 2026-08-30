public class RemoveDuplicate {

    public static void ReDep(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println("New String After Removing Duplicate letter :"+newStr);
            return;
        }

        char curChar=str.charAt(idx);

        if(map[curChar - 'a']==true){
            ReDep(str, idx+1, newStr, map);
        }else{
            map[curChar -'a']=true;
            newStr.append(curChar);
            ReDep(str, idx+1, newStr, map);


        }
    }
    public static void main(String[] args) {
        String str="appanacollege";
        ReDep(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}