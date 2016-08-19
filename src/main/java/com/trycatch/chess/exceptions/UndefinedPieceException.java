package com.trycatch.chess.exceptions;

/**
 * Created by ignacio on 19/08/16.
 */
public class UndefinedPieceException extends Exception {
    public UndefinedPieceException(){
        super("Undefined Piece");
    }
}
