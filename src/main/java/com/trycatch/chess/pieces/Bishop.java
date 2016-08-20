package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Bishop
 * Created by ignacio on 19/08/16.
 */
public class Bishop extends ChessPiece {

    public boolean attacks(Position dest) {
        return false;
    }

    public boolean isSafe() {
        return false;
    }

    @Override
    public String toString() {
        return "B";
    }
}
