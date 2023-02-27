package TP3;

public class Queen extends Piece {
    public Queen(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty()
                && (isInDiagonale(newPosition, getPosition()) || isInRowOrColumn(newPosition, getPosition()));
    }

    public boolean isInRowOrColumn(Position a, Position b) {
        return a.getColumn() == b.getColumn() || a.getRow() == b.getRow();
    }

    private boolean isInDiagonale(Position a, Position b) {
        int xNewBase = a.getColumnInt() - b.getColumnInt();
        int yNewBase = a.getRow() - b.getRow();
        return Math.abs(yNewBase) == Math.abs(xNewBase);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
