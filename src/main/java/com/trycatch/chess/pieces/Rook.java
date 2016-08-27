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
        boolean sameRow = this.getRow() == dest.getRow();
        boolean sameCol = this.getCol() == dest.getCol();
        return sameRow || sameCol;
    }

    @Override
    public char piece() {
        return 'R';
    }

    @Override
    public String toString() {
        return "R";
    }
}
