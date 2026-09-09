import javax.swing.border.Border;

public class Queen2 {

    public static void nQueen(char Board[][],int row){
        
        //base case
        if(row==Board.length){
            printBoard(Board);
            return ;
        }
        for(int j=0;j<Board.length;j++){
            Board[row][j]='Q';
            nQueen(Board, row+1);
            Board[row][j]='X';

        }    
    }

    public static void printBoard(char Board[][]){

        System.out.println("-----new Chess Board--------");
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board.length;j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int n=2;
        char Board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Board[i][j]='X';
            }
        }
        nQueen(Board, 0);
        printBoard(Board);

    }
}