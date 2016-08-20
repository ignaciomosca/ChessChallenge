package com.trycatch.chess.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece {

    public Knight(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        int row = this.getRow();
        int col = this.getCol();
        List<ChessPiece> possibleMoves = new ArrayList<>();
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (i != j) {
                    possibleMoves.add(new Knight(row + i, col + j));
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
