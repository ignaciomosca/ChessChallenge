package com.trycatch.chess.exceptions;

/**
 * Domain Defined Exception for cases where the Piece was misspelled
 * Created by ignacio on 19/08/16.
 */
public class UndefinedPieceException extends Exception {
    public UndefinedPieceException() {
        super("Undefined Piece");
    }
}
