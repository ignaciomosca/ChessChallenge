package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.List;

/**
 * Represents a Bishop
 * Created by ignacio on 19/08/16.
 */
public class Bishop extends ChessPiece{

    public List<Position> moves(){
        return null;
    }

    public boolean isSafe() {
        return false;
    }

    @Override
    public String toString() {
        return "B";
    }
}
