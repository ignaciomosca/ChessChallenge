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
        if (pieces.isEmpty()) {
            solutions.add(board);
        }

        CopyOnWriteArrayList<Position> positions = new CopyOnWriteArrayList<>(board.getPositions());
        CopyOnWriteArrayList<ChessPiece> chessPieces = new CopyOnWriteArrayList<>(pieces);

        for(Position p : positions){
            for(ChessPiece c : chessPieces){
                if(!c.attacks(p)){
                    board.place(p,c);
                    pieces.remove(c);
                    solution(board,pieces,solutions);
                    pieces.add(c);
                    board.remove(p);
                }
            }
        }
        return solutions;
    }
}
