public abstract  class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;
    
    /**
     * constructor with 2 parameters.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * constructor with full parameters.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean validate(int x, int y) {
        return (x >= 1 && y >= 1 && x <= 8 && y <= 8);
    }

    /**
     * method to check position.
     * @param piece the othe piece
     * @return boolean
     */
    public boolean checkPosition(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return false;
        }
        return (piece.getCoordinatesX() == coordinatesX && piece.getCoordinatesY() == coordinatesY);
    }
}