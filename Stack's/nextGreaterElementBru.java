import java.util.Arrays;
public class nextGreaterElementBru {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int n=arr.length;

        int nextGreaterE[]=new int[n];
        
        for(int i=0;i<n;i++){
            nextGreaterE[i]=-1;
            
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    nextGreaterE[i]=arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<nextGreaterE.length;i++){
            System.out.print(nextGreaterE[i]+" ");
        }
    }
}
