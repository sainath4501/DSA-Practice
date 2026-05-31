

class GET_ith_bit {

    public static int get_bit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }  
    
    public static void main(String args[]){
        System.err.println(get_bit(10, 2));
    }
}