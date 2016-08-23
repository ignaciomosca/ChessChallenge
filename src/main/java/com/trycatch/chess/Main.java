package com.trycatch.chess;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Main class
 * Created by ignacio on 19/08/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            BoardPieces boardPieces = Validation.parseInput(args);
            Board initialBoard = boardPieces.getBoard();
            List<String> pieces = boardPieces.getPieces();
            Set<Board> solutions = ChessChallengeSolver.solution(initialBoard, pieces, new HashSet<>());
            long finishTime = System.currentTimeMillis();
            solutions.forEach(Board::showBoard);
            System.out.println("Number of Solutions: " + solutions.size());
            System.out.println("Total Time: " + (finishTime - startTime) + " ms");
        } catch (UndefinedPieceException e) {
            e.printStackTrace();
        }
    }

}




