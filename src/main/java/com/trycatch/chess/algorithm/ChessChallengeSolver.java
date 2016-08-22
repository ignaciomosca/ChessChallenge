package com.trycatch.chess.algorithm;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.inputvalidation.Validation;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolver {

    /***
     * @param board  ChessBoard
     * @param pieces Chess Pieces selected by the user
     * @return return a list of possible solutions to the problem in the form of a list of filled chess boards
     */
    public static List<Board> solution(Board board, List<ChessPiece> pieces, List<Board> solutions) {
        if (pieces.isEmpty()) {
            if (!solutions.contains(board)) {
                solutions.add(board);
            }
        } else {
            for (int i = 1; i < board.getM(); i++) {
                for (int j = 1; j < board.getN(); j++) {
                    if (!pieces.isEmpty()) {
                        ChessPiece c = candidatePiece(i, j, pieces.get(0));
                        if (isSafe(c, board)) {
                            solution(board.place(c), removeFirstPiece(pieces), solutions);
                        }
                    }
                }
            }
        }
        return solutions;
    }

    private static List<ChessPiece> removeFirstPiece(List<ChessPiece> pieces) {
        List<ChessPiece> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

    private static ChessPiece candidatePiece(int row, int col, ChessPiece chessPiece) {
        return Validation.parseName(chessPiece.toString(), row, col);
    }

    /**
     * @param c     ChessPiece to be placed
     * @param board ChessBoard
     * @return true if no other piece in the board gets attacked by c
     */
    private static boolean isSafe(ChessPiece c, Board board) {
        return board.isSafe(c) && !board.contains(c);
    }

}
