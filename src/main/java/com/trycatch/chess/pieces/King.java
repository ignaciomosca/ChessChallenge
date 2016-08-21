package com.trycatch.chess.pieces;

import com.trycatch.chess.inputvalidation.Validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess King
 * Created by ignacio on 19/08/16.
 */
public class King extends ChessPiece {

    private static final int[] X_MOVES = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
    private static final int[] Y_MOVES = new int[]{-1, 0,   1, 1, 1, 0, -1, -1};

    public King(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        int row = this.getRow();
        int col = this.getCol();
        List<ChessPiece> possibleMoves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int destRow = row + X_MOVES[i];
            int destCol = col + Y_MOVES[i];
            if (destRow > 0 && destCol > 0) {
                possibleMoves.add(Validation.parseName(dest.toString(),destRow,destCol));
            }
        }
        return possibleMoves.contains(dest);
    }

    @Override
    public String toString() {
        return "K";
    }
}
