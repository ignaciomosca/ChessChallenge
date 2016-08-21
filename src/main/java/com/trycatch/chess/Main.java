package com.trycatch.chess;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class
 * Created by ignacio on 19/08/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            BoardPieces boardPieces = Validation.parseInput(args);
            Board initialBoard = boardPieces.getBoard();
            List<ChessPiece> pieces = boardPieces.getPieces();
            List<Board> solutions = ChessChallengeSolver.solution(initialBoard, pieces, new ArrayList<>());
            System.out.println("Number of Solutions: " + solutions.size());
        } catch (UndefinedPieceException e) {
            e.printStackTrace();
        }
    }

}




