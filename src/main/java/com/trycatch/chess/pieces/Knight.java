package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece {

    public boolean attacks(Position dest) {
        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
