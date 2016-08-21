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
        if (board.isValidSolution()) {
            if(!solutions.contains(board)){
                solutions.add(board);
                board.showBoard();
            }
        } else {
            List<ChessPiece> auxPieces = new ArrayList<>(pieces);
            for (int i = 1; i < board.getM(); i++) {
                for (int j = 1; j < board.getN(); j++) {
                    ChessPiece c = candidatePiece(i, j, pieces.get(0));
                    if (isSafe(c, board)) {
                        pieces.remove(c);
                        Board placedPieceBoard = board.place(c);
                        solution(placedPieceBoard, pieces, solutions);
                        board.remove(c);
                        removePiece(pieces, auxPieces);
                    }
                }
            }
        }
        return solutions;
    }

    private static void removePiece(List<ChessPiece> pieces, List<ChessPiece> chessPieces) {
        pieces.clear();
        pieces.addAll(chessPieces);
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
        return board.isSafe(c);
    }

}
