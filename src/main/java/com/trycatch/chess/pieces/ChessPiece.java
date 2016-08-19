package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    protected Position pos;
    public abstract String toString();
    public abstract void moves();
    public abstract boolean isSafe();

    public void place(int row, int col, ChessPiece piece){
        pos = new Position(row,col,this);
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
