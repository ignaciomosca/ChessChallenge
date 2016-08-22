package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private int M;
    private int N;
    private List<ChessPiece> usedPieces;

    public Board(int m, int n) {
        this.M = m;
        this.N = n;
        this.usedPieces = new ArrayList<>();
    }

    public Board(int m, int n, List<ChessPiece> chessPieces) {
        this.M = m;
        this.N = n;
        this.usedPieces = new ArrayList<>(chessPieces);
    }

    public void showBoard() {
        for (int r = 1; r < M; r++) {
            for (int c = 1; c < N; c++){
                System.out.print(findPiece(r, c) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Board place(ChessPiece piece) {
        List<ChessPiece> pieces = new ArrayList<>(usedPieces);
        pieces.add(piece);
        return new Board(M, N, pieces);
    }

    public String findPiece(int row, int col) {
        return this.usedPieces.stream().filter(p->p.getCol()==col && p.getRow()==row).findFirst().map(ChessPiece::toString).orElse("_");
    }


    public boolean isSafe(ChessPiece c) {
        return this.usedPieces.stream().filter(p -> (p.attacks(c) || c.attacks(p))).count() == 0;
    }

    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (M != board.M) return false;
        if (N != board.N) return false;
        if (usedPieces.size() != board.usedPieces.size()) return false;
        return samePieces(usedPieces,board.usedPieces);
    }

    private boolean samePieces(List<ChessPiece> boardA, List<ChessPiece> boardB){
        Set<ChessPiece> setA = new HashSet<>(boardA);
        Set<ChessPiece> setB = new HashSet<>(boardB);
        return setA.containsAll(setB);
    }

    @Override
    public int hashCode() {
        int result = M;
        result = 31 * result + N;
        result = 31 * result + usedPieces.hashCode();
        return result;
    }

    public boolean contains(ChessPiece c) {
        return this.usedPieces.contains(c);
    }
}
