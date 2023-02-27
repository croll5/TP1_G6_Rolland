package TP3;

public class Position {
    private char column;
    private int row;

    public String toString() {
        return String.valueOf(column) + row;
    }

    public int getColumnInt() {
        return Character.getNumericValue(this.column) - 9;
    }

    public char getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }
}
