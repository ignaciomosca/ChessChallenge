package com.test.chess;

import com.test.test.algorithm.ChessChallengeSolver;
import com.test.chess.board.Board;
import com.test.chess.inputvalidation.BoardPieces;
import com.test.chess.inputvalidation.Validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Main class
 * Created by ignacio on 19/08/16.
 */
class Main {
    public static void main(String[] args) {
        BoardPieces boardPieces = Validation.createMenu();
        List<Character> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        Set<Board> solutions = new HashSet<>();
        long startTime = System.currentTimeMillis();
        Set<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions, new HashSet<>());
        long finishTime = System.currentTimeMillis();
        actual.forEach(Board::showBoard);
        System.out.println("Number of Solutions: " + actual.size());
        System.out.println("Total Time: " + (finishTime - startTime) + " ms");

    }
}




