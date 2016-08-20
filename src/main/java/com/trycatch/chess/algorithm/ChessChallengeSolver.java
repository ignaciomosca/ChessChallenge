package com.trycatch.chess.algorithm;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.board.Position;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolver {

    public static List<Board> solution(Board board, List<ChessPiece> pieces, List<Board> solutions) {
        if (pieces.isEmpty() && board.validSolution()) {
            solutions.add(board);
            board.showBoard();
        }

        CopyOnWriteArrayList<Position> positions = new CopyOnWriteArrayList<>(board.getPositions());
        CopyOnWriteArrayList<ChessPiece> chessPieces = new CopyOnWriteArrayList<>(pieces);

        for (ChessPiece c : chessPieces) {
            for (Position p : positions) {
                if (!c.attacks(p)) {
                    board.place(p, c);
                    chessPieces.remove(c);
                    positions.remove(p);
                    solution(board, chessPieces, solutions);
                }
            }
        }
        return solutions;
    }
}
