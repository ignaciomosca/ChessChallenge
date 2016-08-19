package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    protected Position pos;
    public abstract void moves();
    public abstract boolean isSafe();
}
