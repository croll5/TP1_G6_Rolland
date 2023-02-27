package TP3;

public class Rook extends Piece {
    public Rook(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty()
                && isInRowOrColumn(newPosition, getPosition());
    }

    public boolean isInRowOrColumn(Position a, Position b) {
        return a.getColumn() == b.getColumn() || a.getRow() == b.getRow();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
