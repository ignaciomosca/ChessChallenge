package com.trycatch.chess.pieces;

import com.trycatch.chess.board.Position;

import java.util.List;

/**
 * Created by ignacio on 19/08/16.
 */
public abstract class ChessPiece {

    protected Position pos;
    public abstract String toString();

    //returns all possible positions that can be reached
    public abstract List<Position> moves();

    public Position place(int row, int col, ChessPiece piece){
        if(!piece.toString().equals("_")){
            return new Position(row,col,this);
        }else{
            return new Position(row,col,new NoPiece());
        }
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
