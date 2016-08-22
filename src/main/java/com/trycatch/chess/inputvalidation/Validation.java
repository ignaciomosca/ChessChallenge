package com.trycatch.chess.inputvalidation;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;

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
        List<String> chessPieces = parsePieces(piecesInput);
        return new BoardPieces(new Board(M, N), chessPieces);
    }

    /**
     * @param piecesInput semi-colon separated string of a key-value based representation of chess pieces and
     *                    how many of them should be placed on the chess board
     * @return a list of chess pieces
     */
    private static List<String> parsePieces(String piecesInput) throws UndefinedPieceException {
        String[] pieceNumber = piecesInput.split(";");
        List<String> pieces = new ArrayList<>();
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
    private static void parsePiece(String pn, List<String> pieces) throws UndefinedPieceException {
        String[] pieceNumber = pn.split(":");
        int number = Integer.parseInt(pieceNumber[1]);
        for (int i = 0; i < number; i++) {
            pieces.add(pieceNumber[0]);
        }
    }

}
