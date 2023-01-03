package boardgame;

public class Piece {//criando peça
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position=null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
