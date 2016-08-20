package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Chess Knight
 * Created by ignacio on 19/08/16.
 */
public class Knight extends ChessPiece {

    public boolean attacks(Position dest) {
        int row = this.getPos().getRow();
        int col = this.getPos().getCol();
        List<Position> possibleMoves = new ArrayList<>();
        int[] moves = new int[]{-2,-1,1,2};
        for (int i = -2; i <=2 ; i++) {
            for (int j = -2; j <= 2; j++) {
                if(i!=j){
                    possibleMoves.add(new Position(row+i,col+j,new Knight()));
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
