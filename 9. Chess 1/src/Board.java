
import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * method to add a piece (if able to add).
     * @param piece the piece to add
     */
    public void addPiece(Piece piece) {
        boolean existPiece = getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) != null;
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY()) && !existPiece) {
            pieces.add(piece);
        }
    }

    public boolean validate(int x, int y) {
        return (x >= 1 && y >= 1 && x <= 8 && y <= 8);
    }

    /**
     * method to remove a piece at a position.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void removeAt(int x, int y) {
        if (validate(x, y)) {
            pieces.remove(getAt(x, y));
        }
    }

    /**
     * method to get a piece at a position.
     * @param x the x coordinate
     * @param y the y coordinate
     * @return a piece at a given position
     */
    public Piece getAt(int x, int y) {
        if (!validate(x, y)) {
            return null;
        }
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}