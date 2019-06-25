package com.test.chess.board;

import com.test.chess.pieces.ChessPiece;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class Board {

    private final int M;
    private final int N;
    private final char[][] board;
    private final ArrayList<ChessPiece> usedPieces;

    public Board(int m, int n) {
        this.M = m;
        this.N = n;
        this.board = new char[M][N];
        this.usedPieces = new ArrayList<>();
    }

    public Board(int m, int n, ArrayList<ChessPiece> usedPieces) {
        this.M = m;
        this.N = n;
        this.board = new char[M][N];
        this.usedPieces = usedPieces;
        addUsedPieces(this.board,this.usedPieces);
    }

    /***
     *
     * @param usedPieces pieces to be set in the board
     */
    private void addUsedPieces(char[][] board, ArrayList<ChessPiece> usedPieces) {
        for (ChessPiece p : usedPieces) {
            board[p.getRow()][p.getCol()] = p.piece();
        }
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
     * @param p ChessPiece to be placed
     * @return a Board with piece placed
     */
    public Board place(ChessPiece p) {
        ArrayList<ChessPiece> newUsedPieces = (ArrayList<ChessPiece>)this.usedPieces.clone();
        newUsedPieces.add(p);
        return new Board(M, N, newUsedPieces);
    }

    /**
     * @param row row of the piece
     * @param col col of the piece
     * @return The piece located in (row,col)
     */
    private char findPiece(int row, int col) {
        char result = this.board[row][col];
        if (result=='\u0000'){
            return '_';
        }else{
            return result;
        }
    }

    /**
     * @param c ChessPiece to be placed
     * @return true if no other piece in the board gets attacked by c and if c is not already placed
     */
    public boolean isSafe(ChessPiece c) {
        boolean doesNotAttackOtherPieces = doesNotAttackOtherPieces(this.usedPieces,c);
        return doesNotAttackOtherPieces && notYetPlaced(c);
    }

    private boolean doesNotAttackOtherPieces(ArrayList<ChessPiece> usedPieces, ChessPiece c) {
        for (ChessPiece p : usedPieces) {
            if(p.attacks(c) || c.attacks(p)){
                return false;
            }
        }
        return true;
    }

    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    private boolean notYetPlaced(ChessPiece c){
        return this.board[c.getRow()][c.getCol()]=='\u0000';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board1 = (Board) o;

        if (M != board1.M) return false;
        if (N != board1.N) return false;
        return Arrays.deepEquals(board, board1.board);

    }

    @Override
    public int hashCode() {
        return 31 * Arrays.deepHashCode(board);
    }

    @Override
    public String toString() {
        return "Board{" +
                "M=" + M +
                ", N=" + N +
                ", board=" + Arrays.toString(board) +
                ", usedPieces=" + usedPieces +
                '}';
    }
}
