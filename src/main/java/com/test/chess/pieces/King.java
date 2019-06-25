package com.test.chess.pieces;

/**
 * Represents a Chess King
 * Created by ignacio on 19/08/16.
 */
public class King extends ChessPiece {
    public King(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        int[] X_MOVES = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
        int[] Y_MOVES = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
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
        return 'K';
    }

}
