package boardgame;

public abstract class Piece {//criando peça
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position=null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
        //rook metodo, faz um gancho com a subclasse concreta da classe piece, template metodo, uma classe concreta utilizando uma classe abstrata

    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;

    }
}
