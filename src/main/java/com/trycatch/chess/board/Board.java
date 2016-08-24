package com.trycatch.chess.board;

import com.trycatch.chess.pieces.ChessPiece;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private int M;
    private int N;
    //Set of used pieces, since the order is not important, and two pieces shouldn't be repeated I chose Set as a structure
    //O(1) or retrieval
    private Set<ChessPiece> usedPieces;

    public Board(int m, int n) {
        this.M = m;
        this.N = n;
        this.usedPieces = new HashSet<>();
    }

    public Board(int m, int n, Set<ChessPiece> chessPieces) {
        this.M = m;
        this.N = n;
        this.usedPieces = new HashSet<>(chessPieces);
    }

    /***
     * Displays the board to screen
     */
    public void showBoard() {
        for (int r = 1; r < M; r++) {
            for (int c = 1; c < N; c++){
                System.out.print(findPiece(r, c) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * @param piece ChessPiece to be placed
     * @return a Board with piece placed
     */
    public Board place(ChessPiece piece) {
        Set<ChessPiece> pieces = new HashSet<>(usedPieces);
        pieces.add(piece);
        return new Board(M, N, pieces);
    }

    /**
     * @param row
     * @param col
     * @return The piece located in (row,col)
     */
    public String findPiece(int row, int col) {
        return this.usedPieces.stream().filter(p->p.getCol()==col && p.getRow()==row).findFirst().map(ChessPiece::toString).orElse("_");
    }

    /**
     * @param c     ChessPiece to be placed
     * @return true if no other piece in the board gets attacked by c and if c is not already placed
     */
    public boolean isSafe(ChessPiece c) {
        boolean doesNotAttackOtherPieces = this.usedPieces.stream().filter(p -> (p.attacks(c) || c.attacks(p))).count() == 0;
        boolean isNotAlreadyPlaced = !this.usedPieces.contains(c);
        return doesNotAttackOtherPieces && isNotAlreadyPlaced;
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
        if (!(o instanceof Board)) return false;

        Board board = (Board) o;

        if (M != board.M) return false;
        if (N != board.N) return false;
        if (usedPieces.size() != board.usedPieces.size()) return false;

        return usedPieces.equals(board.usedPieces);

    }

    @Override
    public int hashCode() {
        int result = M;
        result = 31 * result + N;
        Iterator i = usedPieces.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            result = 31*result + (obj==null ? 0 : obj.hashCode());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "M=" + M +
                ", N=" + N +
                ", usedPieces=" + usedPieces +
                '}';
    }
}
