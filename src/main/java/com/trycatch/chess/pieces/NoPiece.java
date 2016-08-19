package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacio on 19/08/16.
 */
public class NoPiece extends ChessPiece {

    public List<Position> moves(){
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "_";
    }

}
