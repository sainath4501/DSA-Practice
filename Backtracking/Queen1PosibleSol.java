public class Queen1PosibleSol {

    public static boolean nQueen(char Board[][],int row){
        if(row==Board.length){
            printBoard(Board);
            return true;
        }

        for(int j=0;j<Board.length;j++){
           if(isSafe(Board, row, j)){
            Board[row][j]='Q';
            if(nQueen(Board, row+1)){
                return true;
            }
            Board[row][j]='X';
           }
        }
        return false;
    }

    public static boolean isSafe(char Board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(Board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j < Board.length; i--,j++){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static int count = 0;
    public static void printBoard(char Board[][]){
        System.out.println("------new Chess Board------");

        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board.length;j++){
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=2;
        char Board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Board[i][j]='X';
            }
        }
        if(nQueen(Board, 0)){
            System.out.println("Possible solution is: ");
            printBoard(Board);
        }else{
            System.out.println("There is no Possible Solution.....!");
        }
        System.out.println("Total no-of ways to print the solution is: "+count);
    }
}