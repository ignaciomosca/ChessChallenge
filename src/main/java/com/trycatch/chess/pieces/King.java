package com.trycatch.chess.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess King
 * Created by ignacio on 19/08/16.
 */
public class King extends ChessPiece {

    public King(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        int row = this.getRow();
        int col = this.getCol();
        List<ChessPiece> possibleMoves = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                possibleMoves.add(new King(row + i, col + j));
            }
        }
        return possibleMoves.contains(dest);
    }

    @Override
    public String toString() {
        return "K";
    }
}
