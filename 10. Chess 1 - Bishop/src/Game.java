
import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game() {
        board = new Board();
        moveHistory = new ArrayList<>();
    }

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * method to move a piece.
     * @param piece the piece to move
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            Piece pieceAt = board.getAt(x, y);
            if (pieceAt == null) {
                move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece);
            } else {
                move = new Move(
                        piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece, pieceAt);
                board.removeAt(x, y);
            }

            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }
}