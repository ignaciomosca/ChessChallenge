package com.trycatch.chess.pieces;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece{
    public void moves() {

    }

    public boolean isSafe() {
        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
