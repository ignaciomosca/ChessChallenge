package com.trycatch.chess.inputvalidation;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The purpose of this class is to validate the inputs provided by the user
 * and to provide useful information in case the input is not correct
 * Created by ignacio on 19/08/16.
 */
public class Validation {

    /**
     * @param args user provided input-array
     * @return a container object that has a Board of MxN dimensions, and a list of ChessPieces provided by the input of the program
     * @throws UndefinedPieceException
     */
    public static BoardPieces parseInput(String[] args) throws UndefinedPieceException {
        int M = Integer.parseInt(args[0]) + 1;
        int N = Integer.parseInt(args[1]) + 1;
        String piecesInput = args[2];
        List<Character> chessPieces = parsePieces(piecesInput);
        return new BoardPieces(new Board(M, N), chessPieces);
    }

    /**
     * @param piecesInput semi-colon separated string of a key-value based representation of chess pieces and
     *                    how many of them should be placed on the chess board
     * @return a list of chess pieces
     */
    private static List<Character> parsePieces(String piecesInput) throws UndefinedPieceException {
        String[] pieceNumber = piecesInput.split(";");
        List<Character> pieces = new ArrayList<>();
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
     *
     * @param pieces pieces defined by the user to be used
     * @param pn     represents a piece and how many of them will be in the chess board
     */
    private static void parsePiece(String pn, List<Character> pieces) throws UndefinedPieceException {
        String[] pieceNumber = pn.split(":");
        int number = Integer.parseInt(pieceNumber[1]);
        for (int i = 0; i < number; i++) {
            pieces.add(pieceNumber[0].charAt(0));
        }
    }

    /***
     *
     * @return creates a wizard that creates the initial conditions for the challenge
     */
    public static BoardPieces createMenu(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the value of M: ");
        int M = reader.nextInt()+ 1;
        System.out.println("Enter the value of N: ");
        int N = reader.nextInt() + 1;
        List<Character> pieces = new ArrayList<>();
        createPieces(pieces,'K',"Enter the number of Kings: ", reader);
        createPieces(pieces,'Q',"Enter the number of Queens: ", reader);
        createPieces(pieces,'B',"Enter the number of Bishops: ", reader);
        createPieces(pieces,'N',"Enter the number of Knights: ", reader);
        createPieces(pieces,'R',"Enter the number of Rooks: ", reader);
        return new BoardPieces(new Board(M,N),pieces);
    }

    /***
     *
     * @param pieces list of pieces to be created
     * @param piece type of piece
     * @param message message to be displayed to the user
     * @param reader scanner to obtain input
     */
    private static void createPieces(List<Character> pieces, Character piece, String message, Scanner reader) {
        System.out.println(message);
        int quantity = reader.nextInt();
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                pieces.add(piece);
            }
        }
    }

}
