package com.trycatch.chess.inputValidation;

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
     * [name of piece in plural]:[number of pieces]
     * Example format: queens:2;kings:3;
     *
     * @param pieces pieces defined by the user to be used
     * @param pn     represents a piece and how many of them will be in the chess board
     */
    private static void parsePiece(String pn, List<ChessPiece> pieces) throws UndefinedPieceException {
        String[] pieceNumber = pn.split(":");
        ChessPiece piece = parseName(pieceNumber[0]);
        int number = Integer.parseInt(pieceNumber[1]);
        for (int i = 0; i < number; i++) {
            pieces.add(piece);
        }
    }

    /**
     * @param pieceName recieves the name of the piece
     * @return an instance of the ChessPiece
     * @throws UndefinedPieceException in case the name of the piece is invalid
     */
    private static ChessPiece parseName(String pieceName) throws UndefinedPieceException {
        switch (pieceName.toLowerCase()) {
            case "queen":
                return new Queen(0,0);
            case "king":
                return new King(0,0);
            case "rook":
                return new Rook(0,0);
            case "bishop":
                return new Bishop(0,0);
            case "knight":
                return new Knight(0,0);
            default:
                throw new UndefinedPieceException();
        }
    }

}
