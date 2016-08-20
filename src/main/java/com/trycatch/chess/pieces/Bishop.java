package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Bishop
 * Created by ignacio on 19/08/16.
 */
public class Bishop extends ChessPiece {

    public boolean attacks(Position dest) {
        boolean sameDiag = Math.abs(dest.getRow() - this.getPos().getRow()) == Math.abs(dest.getCol() - this.getPos().getCol());
        return this.getPos() != null && sameDiag;
    }

    @Override
    public String toString() {
        return "B";
    }
}
