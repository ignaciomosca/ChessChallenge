package com.trycatch.chess.inputValidation;

import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacio on 19/08/16.
 */
public class Validation {

    public static List<ChessPiece> parsePieces(String piecesInput) throws UndefinedPieceException {
        String[] pieceNumber = piecesInput.split(";");
        List<ChessPiece> pieces = new ArrayList<>();
        for(String pn : pieceNumber){
            parsePiece(pn,pieces);
        }
        return pieces;
    }

    //Current format is the following
    //[name of piece in plural]:[number of pieces]
    //Example format: queens:2;kings:3;
    public static void parsePiece(String pn, List<ChessPiece> pieces) throws UndefinedPieceException {
        String[] pieceNumber = pn.split(":");
        ChessPiece piece = parseName(pieceNumber[0]);
        int number = Integer.parseInt(pieceNumber[1]);
        for(int i=0;i<number;i++){
            pieces.add(piece);
        }
    }

    public static ChessPiece parseName(String pieceName) throws UndefinedPieceException {
        switch (pieceName.toLowerCase()){
            case "queen":
                return new Queen();
            case "king":
                return new King();
            case "rook":
                return new Rook();
            case "bishop":
                return new Bishop();
            case "knight":
                return new Knight();
            default:
                throw new UndefinedPieceException();
        }
    }

}
