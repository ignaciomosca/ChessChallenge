package com.trycatch.chess.pieces;

/**
 * Represents a Bishop
 * Created by ignacio on 19/08/16.
 */
public class Bishop extends ChessPiece {

    public Bishop(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        return Math.abs(dest.getRow() - this.getRow()) == Math.abs(dest.getCol() - this.getCol());
    }

    @Override
    public char piece() {
        return 'B';
    }

    @Override
    public String toString() {
        return "B";
    }
}
