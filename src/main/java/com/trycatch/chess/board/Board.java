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
    private long numberOfInitialPieces;
    private long placedPieces;

    public Board(int m, int n, int numberOfInitialPieces) {
        this.M = m;
        this.N = n;
        this.placedPieces=0;
        this.numberOfInitialPieces=numberOfInitialPieces;
        initializePositions(m,n);
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

    public void place(Position position, ChessPiece chessPiece){
        chessPiece.setPos(position);
        position.setPiece(chessPiece);
        this.placedPieces += 1;
        this.getPositions().add(position);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (M != board.M) return false;
        if (N != board.N) return false;
        return positions != null ? positions.equals(board.positions) : board.positions == null;

    }

    public boolean validSolution() {
        return this.placedPieces==numberOfInitialPieces;

    }
}
