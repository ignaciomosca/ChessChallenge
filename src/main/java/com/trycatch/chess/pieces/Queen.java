package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

/**
 * Represents a Chess Queen
 * Created by ignacio on 19/08/16.
 */
public class Queen extends ChessPiece {

    public boolean attacks(Position dest) {
        if(this.getPos()!=null){
            boolean sameRow=this.getPos().getRow() == dest.getRow();
            boolean sameCol=this.getPos().getCol() == dest.getCol();
            boolean sameDiag=Math.abs(dest.getRow() - this.getPos().getRow()) == Math.abs(dest.getCol() - this.getPos().getCol());
            return sameRow || sameCol || sameDiag;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Q";
    }
}
