package TP3;

public class Knight extends Piece {
    public Knight(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty()
                && isGoodJump(newPosition, getPosition());
    }

    public boolean isGoodJump(Position a, Position b) {
        if (a.getColumnInt() == b.getColumnInt() + 2
                && (a.getRow() == b.getRow() + 1 || a.getRow() == b.getRow() - 1)) {
            return true;
        }
        if (a.getColumnInt() == b.getColumnInt() - 2
                && (a.getRow() == b.getRow() + 1 || a.getRow() == b.getRow() - 1)) {
            return true;
        }
        if (a.getRow() == b.getRow() + 2
                && (a.getColumnInt() == b.getColumnInt() + 1 || a.getColumnInt() == b.getColumnInt() - 1)) {
            return true;
        }
        if (a.getRow() == b.getRow() - 2
                && (a.getColumnInt() == b.getColumnInt() + 1 || a.getColumnInt() == b.getColumnInt() - 1)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
