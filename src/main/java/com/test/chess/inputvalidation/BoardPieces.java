package com.test.chess.inputvalidation;

import com.test.chess.board.Board;

import java.util.List;

/**
 * Container object for a Board and a List of Chess Pieces, used for defining initial conditions
 * Created by ignacio on 20/08/16.
 */
public class BoardPieces {
    private Board board;

    public BoardPieces(Board board, List<Character> pieces) {
        this.board = board;
        this.pieces = pieces;
    }

    private List<Character> pieces;

    public Board getBoard() {
        return board;
    }

    public List<Character> getPieces() {
        return pieces;
    }

    public void setPieces(List<Character> pieces) {
        this.pieces = pieces;
    }
}
