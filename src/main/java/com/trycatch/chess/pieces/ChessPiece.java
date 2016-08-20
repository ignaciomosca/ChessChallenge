package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    protected Position pos;

    public abstract String toString();

    //returns all possible positions that can be reached
    public abstract boolean attacks(Position dest);

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
