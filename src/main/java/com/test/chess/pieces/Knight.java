package com.test.chess.pieces;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece {

    public Knight(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        int[] X_MOVES = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        int[] Y_MOVES = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        int row = this.getRow();
        int col = this.getCol();
        for (int i = 0; i < 8; i++) {
            int destRow = row + X_MOVES[i];
            int destCol = col + Y_MOVES[i];
            if (destRow > 0 && destCol > 0 && dest.getRow() == destRow && dest.getCol() == destCol) {
                return true;
            }
        }
        return false;
    }

    @Override
    public char piece() {
        return 'N';
    }

}
