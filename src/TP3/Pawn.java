package TP3;

public class Pawn extends Piece {
    public Pawn(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return board[newPosition.getRow()][newPosition.getColumnInt()].isEmpty()
                && getPosition().getRow() == newPosition.getRow() + 1;
    }

    @Override
    public String toString() {
        return "P";
    }

}
