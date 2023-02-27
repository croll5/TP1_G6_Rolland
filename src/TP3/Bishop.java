package TP3;

public class Bishop extends Piece {
    public Bishop(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return isInDiagonale(newPosition, this.getPosition())
                && board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty();
    }

    private boolean isInDiagonale(Position a, Position b) {
        int xNewBase = a.getColumnInt() - b.getColumnInt();
        int yNewBase = a.getRow() - b.getRow();
        return Math.abs(yNewBase) == Math.abs(xNewBase);
    }

    @Override
    public String toString() {
        return "B";
    }
}
