package TP3;

public abstract class Piece {
    private Position position;
    private int color;

    public Piece(Position position, int color) {
        this.color = color;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public abstract boolean isValidMove(Position newPosition, Cell[][] board);

    public abstract String toString();
}
