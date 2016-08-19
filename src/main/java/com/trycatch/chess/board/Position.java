package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;

/**
 * Represents a position in the Chess Board
 * Created by ignacio on 19/08/16.
 */
public class Position {

    private int row;
    private int col;
    private ChessPiece piece;

    public Position(){}

    public Position(int row, int col, ChessPiece piece) {
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    @Override
    public String toString() {
        if(piece == null){
            return " ";
        }else{
            return piece.toString();
        }
    }

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

    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }
}
