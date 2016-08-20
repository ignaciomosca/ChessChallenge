package com.trycatch.chess.pieces;

/**
 * Represents an abstract Chess Piece
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    private int row;
    private int col;

    public ChessPiece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * @param piece Tentative position for the chess piece
     * @return Returns all possible positions that can be reached
     * */
    public abstract boolean attacks(ChessPiece piece);

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
