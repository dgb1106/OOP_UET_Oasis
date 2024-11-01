public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (board.validate(x, y) == false || invalidMove(x, y) == true) {
            return false;
        }
        Piece currentPiecePosition = board.getAt(x, y);
        if (currentPiecePosition != null) {
            if (currentPiecePosition.getColor().equals(this.getColor())) {
                return false;
            }
        }
        if (x != getCoordinatesX()) {
            return canMoveHorizontal(board, x, y);
        } else {
            return canMoveVertical(board, x, y);
        }
    }

    /**
     * method to check if it is able to move vertically.
     * @param board the game board
     * @param x the x coordinate
     * @param y the y coordinate
     * @return boolean
     */
    public boolean canMoveVertical(Board board, int x, int y) {
        int currentY = this.getCoordinatesY();
        int dy;
        if (currentY < y) {
            dy = 1;
        } else {
            dy = -1;
        }
        currentY += dy;
        while (currentY != y) {
            if (board.getAt(x, currentY) != null) {
                return false;
            }
            currentY += dy;
        }
        return true;
    }

    /**
     * method to check if it is able to move horizontally.
     * @param board the game board
     * @param x the x coordinate
     * @param y the y coordinate
     * @return boolean
     */
    public boolean canMoveHorizontal(Board board, int x, int y) {
        int currentX = this.getCoordinatesX();
        int dx;
        if (currentX < x) {
            dx = 1;
        } else {
            dx = -1;
        }
        currentX += dx;
        while (currentX != x) {
            if (board.getAt(currentX, y) != null) {
                return false;
            }
            currentX += dx;
        }
        return true;
    }

    public boolean invalidMove(int x, int y) {
        return (this.getCoordinatesX() != x && this.getCoordinatesY() != y)
        || (this.getCoordinatesX() == x && this.getCoordinatesY() == y);
    }
}