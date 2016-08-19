package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;
import com.trycatch.chess.pieces.NoPiece;

import java.util.List;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private int M;
    private int N;
    private List<Position> positions;

    public Board() {

    }

    public Board(int m, int n, List<Position> positions) {
        M = m;
        N = n;
        this.positions = positions;
    }

    public void showBoard() {
         for (int r = 1; r < M; r++) {
                for (int c = 1; c < N; c++)
                    System.out.print(findPiece(r,c).toString() + " ");
                System.out.println();
            }
    }

    public ChessPiece findPiece(int row, int col){
        return positions.stream().filter(p -> p.getRow()==row && p.getCol()==col).map(Position::getPiece).findFirst().orElse(new NoPiece());
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPieces(List<Position> positions) {
        this.positions = positions;
    }
}
