package com.trycatch.chess.inputvalidation;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.List;

/**
 * Container object for a Board and a List of Chess Pieces, used for defining initial conditions
 * Created by ignacio on 20/08/16.
 */
public class BoardPieces {
    private Board board;

    public BoardPieces(Board board, List<ChessPiece> pieces) {
        this.board = board;
        this.pieces = pieces;
    }

    private List<ChessPiece> pieces;

    public Board getBoard() {
        return board;
    }

    public List<ChessPiece> getPieces() {
        return pieces;
    }

    public void setPieces(List<ChessPiece> pieces) {
        this.pieces = pieces;
    }
}
