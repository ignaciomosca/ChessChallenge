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
            BoardPieces boardPieces = Validation.parseInput(new String[]{"7", "7", "K:2;Q:2;B:2;N:1"});
            List<String> pieces = boardPieces.getPieces();
            Board board = boardPieces.getBoard();
            Set<Board> solutions = new HashSet<>();
            Set<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions, new HashSet<>());
            System.out.println("Number of Solutions: "+actual.size());
            long finishTime = System.currentTimeMillis();
            System.out.println("Total Time: " + (finishTime - startTime) + " ms");
        } catch (UndefinedPieceException e) {
            e.printStackTrace();
        }
    }

}




