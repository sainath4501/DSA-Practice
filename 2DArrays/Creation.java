import java.util.Scanner;

public class Creation {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found at index at ("+i +"," +j+")");
                    return true;
                }
            }
        }
        return false;
        
    }

    public static int search1(int matrix[][]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(Largest<matrix[i][j]){
                    Largest=matrix[i][j];
            
                    
                }
            }
        
        }
        return Largest;
    }

    public static void main(String args[]){

        int matrix[][]=new int[4][3];
        int n=matrix.length;
        int m=matrix[0].length;
        

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        search(matrix, 5);
        int largest = search1(matrix);
        System.out.println("Largest Number is " + largest);

        //printing
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}