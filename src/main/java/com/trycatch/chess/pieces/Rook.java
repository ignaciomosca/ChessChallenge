package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Chess Rook
 * Created by ignacio on 19/08/16.
 */
public class Rook extends ChessPiece {

    public boolean attacks(Position dest) {
        boolean diagForward = dest.getRow() == this.getPos().getRow();
        return this.getPos() != null && diagForward;
    }

    @Override
    public String toString() {
        return "R";
    }
}
