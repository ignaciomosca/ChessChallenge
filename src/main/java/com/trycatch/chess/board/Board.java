package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;
import com.trycatch.chess.pieces.NoPiece;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private int M;
    private int N;
    private List<Position> positions;

    public Board(int m, int n) {
        M = m;
        N = n;
        initializePositions(m,n);
    }

    public Board(int m, int n, List<Position> positions) {
        M = m;
        N = n;
        this.positions = positions;
    }

    private void initializePositions(int m, int n) {
        this.positions = new ArrayList<>();
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                this.positions.add(new Position(row,col, new NoPiece()));
            }
        }
    }

    public void showBoard() {
        for (int r = 1; r < M; r++) {
            for (int c = 1; c < N; c++)
                System.out.print(findPiece(r, c).toString() + " ");
            System.out.println();
        }
        System.out.println();
    }

    public ChessPiece findPiece(int row, int col){
        return positions.stream().filter(p -> p.getRow()==row && p.getCol()==col).map(Position::getPiece).findFirst().orElse(new NoPiece());
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPieces(List<Position> positions) {
        this.positions = positions;
    }
}
