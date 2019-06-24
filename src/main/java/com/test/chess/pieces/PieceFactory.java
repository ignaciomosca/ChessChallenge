package com.test.chess.pieces;

import com.test.chess.exceptions.UndefinedPieceException;

/**
 * Created by ignacio on 22/08/16.
 */
public class PieceFactory {

    /**
     * @param pieceName receives the code of the piece
     * @param row       row of the piece
     * @param col       column of the piece
     * @return an instance of the ChessPiece
     * @throws UndefinedPieceException in case the name of the piece is invalid
     */
    public static ChessPiece createPiece(char pieceName, int row, int col) {
        switch (pieceName) {
            case 'Q':
                return new Queen(row, col);
            case 'K':
                return new King(row, col);
            case 'R':
                return new Rook(row, col);
            case 'B':
                return new Bishop(row, col);
            case 'N':
                return new Knight(row, col);
        }
        return null;
    }

}
