package com.trycatch.chess.pieces;

/**
 * Created by ignacio on 19/08/16.
 */
public class NoPiece extends ChessPiece {
    @Override
    public String toString() {
        return "_";
    }

    @Override
    public void moves() {

    }

    @Override
    public boolean isSafe() {
        return false;
    }
}
