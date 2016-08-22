package com.trycatch.chess.inputvalidation;

import com.trycatch.chess.board.Board;

import java.util.List;

/**
 * Container object for a Board and a List of Chess Pieces, used for defining initial conditions
 * Created by ignacio on 20/08/16.
 */
public class BoardPieces {
    private Board board;

    public BoardPieces(Board board, List<String> pieces) {
        this.board = board;
        this.pieces = pieces;
    }

    private List<String> pieces;

    public Board getBoard() {
        return board;
    }

    public List<String> getPieces() {
        return pieces;
    }

    public void setPieces(List<String> pieces) {
        this.pieces = pieces;
    }
}
