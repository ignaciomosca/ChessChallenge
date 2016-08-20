package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Created by ignacio on 19/08/16.
 */
public class NoPiece extends ChessPiece {

    public boolean attacks(Position dest){
        return false;
    }

    @Override
    public String toString() {
        return "_";
    }

}
