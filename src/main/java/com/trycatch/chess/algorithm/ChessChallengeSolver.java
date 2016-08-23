package com.trycatch.chess.algorithm;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.pieces.ChessPiece;
import com.trycatch.chess.pieces.PieceFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolver {

    /***
     * @param board  ChessBoard
     * @param pieces Chess Pieces selected by the user
     * @return return a list of possible solutions to the problem in the form of a list of filled chess boards
     */
    public static Set<Board> solution(Board board, List<String> pieces, Set<Board> solutions, Set<Board> testedConfigurations) {
        if (!pieces.isEmpty()) {
            for (int i = 1; i < board.getM(); i++) {
                for (int j = 1; j < board.getN(); j++) {
                    ChessPiece c = PieceFactory.createPiece(pieces.get(0), i, j);
                    if (board.isSafe(c)) {
                        Board b = board.place(c);
                        if (pieces.size() != 1) {
                            if (!testedConfigurations.contains(b)) {
                                testedConfigurations.add(b);
                                solution(b, removeFirstPiece(pieces), solutions, testedConfigurations);
                            }
                        } else {
                            if (!solutions.contains(b)) {
                                solutions.add(b);
                            }
                        }
                    }
                }
            }
        }
        return solutions;
    }

    private static List<String> removeFirstPiece(List<String> pieces) {
        List<String> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

    private static Set<Board> addToSet(Set<Board> testedConfigurations, Board board) {
        Set<Board> withPiece = new HashSet<>(testedConfigurations);
        withPiece.add(board);
        return withPiece;
    }

}
