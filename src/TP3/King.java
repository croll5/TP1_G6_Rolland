package TP3;

public class King extends Piece {
    public King(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return isFrontalier(newPosition, getPosition())
                && board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty();
    }

    public boolean isFrontalier(Position a, Position b) {
        boolean valid = true;
        valid &= a.getColumnInt() > b.getColumnInt() - 2;
        valid &= a.getColumnInt() < b.getColumnInt() + 2;
        valid &= a.getRow() < b.getRow() + 2;
        valid &= a.getRow() > b.getRow() - 2;
        return valid;
    }

    @Override
    public String toString() {
        return "K";
    }
}
