package com.trycatch.chess.pieces;

/**
 * Represents a Bishop
 * Created by ignacio on 19/08/16.
 */
public class Bishop extends ChessPiece{
    public void moves() {

    }

    public boolean isSafe() {
        return false;
    }

    @Override
    public String toString() {
        return "B";
    }
}
