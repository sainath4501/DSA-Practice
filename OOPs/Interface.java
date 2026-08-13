public class Interface{
    public static void main(String args[]){
        Queen q1=new Queen();
        q1.move();
        King k1=new King();
        k1.move();
        k1.mate();
    
    }
}

interface ChessPlayer{

    void move();
}

interface Checkmate{
    void mate();

}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Queen can move all 4 direction and diagonal");
    }
}

class King implements ChessPlayer,Checkmate{
    public void move(){
        System.out.println("King can move all 4 direction and diagonal");
    }

    public void mate(){
        System.out.println("1 CheckMate");
    }
}