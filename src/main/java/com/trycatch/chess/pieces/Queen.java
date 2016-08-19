package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.List;

/**
 * Represents a Chess Queen
 * Created by ignacio on 19/08/16.
 */
public class Queen extends ChessPiece{

    public List<Position> moves(){
        return null;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
