package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess King
 * Created by ignacio on 19/08/16.
 */
public class King extends ChessPiece {

    public boolean attacks(Position dest) {
        int row = this.getPos().getRow();
        int col = this.getPos().getCol();
        List<Position> possibleMoves = new ArrayList<>();
        for (int i = -1; i <= 1 ; i++) {
            for (int j = -1; j <= 1; j++) {
                possibleMoves.add(new Position(row+i,col+j,new King()));
            }
        }
        return possibleMoves.contains(dest);
    }

    @Override
    public String toString() {
        return "K";
    }
}
