package com.trycatch.chess.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece {

    private static final int[] X_MOVES = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    private static final int[] Y_MOVES = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};

    public Knight(int row, int col) {
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
                possibleMoves.add(PieceFactory.createPiece(dest.toString(), destRow, destCol));
            }
        }
        return possibleMoves.contains(dest);
    }

    @Override
    protected PIECE getKind() {
        return PIECE.N;
    }

    @Override
    public String toString() {
        return "N";
    }
}
