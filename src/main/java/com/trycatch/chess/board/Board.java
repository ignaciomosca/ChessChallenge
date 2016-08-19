package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private int M;
    private int N;
    private ChessPiece[] pieces;

    public Board(){

    }

    public Board(int m, int n, ChessPiece[] pieces) {
        M = m;
        N = n;
        this.pieces = pieces;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public ChessPiece[] getPieces() {
        return pieces;
    }

    public void setPieces(ChessPiece[] pieces) {
        this.pieces = pieces;
    }
}
