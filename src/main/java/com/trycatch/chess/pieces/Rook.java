package com.trycatch.chess.pieces;

/**
 * Represents a Chess Rook
 * Created by ignacio on 19/08/16.
 */
public class Rook extends ChessPiece {

    public Rook(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        return dest.getRow() == this.getRow();
    }

    @Override
    public String toString() {
        return "R";
    }
}
