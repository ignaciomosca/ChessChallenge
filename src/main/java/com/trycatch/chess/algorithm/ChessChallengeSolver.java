package com.trycatch.chess.algorithm;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.pieces.ChessPiece;

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
            solutions.add(board);
            board.showBoard();
        } else {
            for (int i = 0; i < pieces.size(); i++) {
                List<ChessPiece> candidatePositions = board.emptyPositions();
                for (int j = 0; j < candidatePositions.size(); j++) {
                    ChessPiece c = candidatePiece(candidatePositions.get(j),pieces.get(i));
                    if (isSafe(c, board)) {
                        pieces.remove(c);
                        solution(board.place(c), pieces, solutions);
                    }
                }
            }
        }
        return solutions;
    }

    private static ChessPiece candidatePiece(ChessPiece position, ChessPiece chessPiece) {
        ChessPiece candidate = chessPiece;
        candidate.setRow(position.getRow());
        candidate.setCol(position.getCol());
        return candidate;
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
