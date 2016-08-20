package com.trycatch.chess.pieces;

/**
 * Represents a unoccupied position in the Chess Board
 * Created by ignacio on 19/08/16.
 */
public class NoPiece extends ChessPiece {

    public NoPiece(int row, int col) {
        super(row, col);
    }

    public boolean attacks(ChessPiece dest) {
        return false;
    }

    @Override
    public String toString() {
        return "_";
    }

}
