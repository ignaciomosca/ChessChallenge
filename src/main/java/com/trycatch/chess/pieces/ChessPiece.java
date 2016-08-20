package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents an abstract Chess Piece
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    protected Position pos;

    /**
     * returns all possible positions that can be reached
     * @param dest Tentative position for the chess piece
     * */
    public abstract boolean attacks(Position dest);

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
