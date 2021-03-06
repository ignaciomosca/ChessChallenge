package com.test.chess.pieces;

/**
 * Represents a Chess Queen
 * Created by ignacio on 19/08/16.
 */
public class Queen extends ChessPiece {

    public Queen(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        boolean sameRow = this.getRow() == dest.getRow();
        boolean sameCol = this.getCol() == dest.getCol();
        boolean sameDiag = Math.abs(dest.getRow() - this.getRow()) == Math.abs(dest.getCol() - this.getCol());
        return sameRow || sameCol || sameDiag;
    }

    @Override
    public char piece() {
        return 'Q';
    }

}
