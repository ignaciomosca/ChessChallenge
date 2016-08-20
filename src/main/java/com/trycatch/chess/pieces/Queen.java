package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Chess Queen
 * Created by ignacio on 19/08/16.
 */
public class Queen extends ChessPiece{

    public boolean attacks(Position dest){
        return
        this.getPos()!=null && (this.getPos().getRow()==dest.getRow() ||
                this.getPos().getCol()==dest.getCol() ||
                Math.abs(this.getPos().getRow()-dest.getRow())==Math.abs(this.getPos().getCol()-dest.getCol()))
        ;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
