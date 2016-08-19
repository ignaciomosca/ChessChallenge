package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.List;

/**
 * Represents a Chess King
 * Created by ignacio on 19/08/16.
 */
public class King extends ChessPiece {

    public List<Position> moves(){
        return null;
    }

    @Override
    public String toString() {
        return "K";
    }
}
