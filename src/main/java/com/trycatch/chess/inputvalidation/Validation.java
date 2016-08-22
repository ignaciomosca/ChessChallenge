package com.trycatch.chess.inputvalidation;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of this class is to validate the inputs provided by the user
 * and to provide useful information in case the input is not correct
 * Created by ignacio on 19/08/16.
 */
public class Validation {

    /**
     * @param args console provided input-array
     * @return a container object that has a Board of MxN dimensions, and a list of ChessPieces provided by the input of the program
     * @throws UndefinedPieceException
     */
    public static BoardPieces parseInput(String[] args) throws UndefinedPieceException {
        int M = Integer.parseInt(args[0]) + 1;
        int N = Integer.parseInt(args[1]) + 1;
        String piecesInput = args[2];
        List<ChessPiece> chessPieces = parsePieces(piecesInput);
        return new BoardPieces(new Board(M, N), chessPieces);
    }

    /**
     * @param piecesInput semi-colon separated string of a key-value based representation of chess pieces and
     *                    how many of them should be placed on the chess board
     * @return a list of chess pieces
     */
    private static List<ChessPiece> parsePieces(String piecesInput) throws UndefinedPieceException {
        String[] pieceNumber = piecesInput.split(";");
        List<ChessPiece> pieces = new ArrayList<>();
        for (String pn : pieceNumber) {
            parsePiece(pn, pieces);
        }
        return pieces;
    }

    /**
     * Current format is the following
     * <p>
     * piece_code:
     * * King - K
     * * Queen - Q
     * * Bishop - B
     * * Knight - N
     * * Rook - R
     * <p>
     * [piece_code]:[number of pieces]
     * Example format: Q:2;K:3;
     *
     * @param pieces pieces defined by the user to be used
     * @param pn     represents a piece and how many of them will be in the chess board
     */
    private static void parsePiece(String pn, List<ChessPiece> pieces) throws UndefinedPieceException {
        String[] pieceNumber = pn.split(":");
        int number = Integer.parseInt(pieceNumber[1]);
        for (int i = 0; i < number; i++) {
            pieces.add(parseName(pieceNumber[0]));
        }
    }

    /**
     * @param pieceName recieves the name of the piece
     * @return an instance of the ChessPiece
     * @throws UndefinedPieceException in case the name of the piece is invalid
     */
    public static ChessPiece parseName(String pieceName) throws UndefinedPieceException {
        switch (pieceName) {
            case "Q":
                return new Queen(0, 0);
            case "K":
                return new King(0, 0);
            case "R":
                return new Rook(0, 0);
            case "B":
                return new Bishop(0, 0);
            case "N":
                return new Knight(0, 0);
            default:
                throw new UndefinedPieceException();
        }
    }

    public static ChessPiece parseName(String pieceName, int row, int col) {
        switch (pieceName) {
            case "Q":
                return new Queen(row, col);
            case "K":
                return new King(row, col);
            case "R":
                return new Rook(row, col);
            case "B":
                return new Bishop(row, col);
            case "N":
                return new Knight(row, col);
        }
        return null;
    }

}
