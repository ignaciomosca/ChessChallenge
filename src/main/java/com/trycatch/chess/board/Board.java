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
    private ChessPiece[][] positions;

    public Board(int m, int n) {
        this.M = m;
        this.N = n;
        initializePositions(m, n);
    }

    public Board(int m, int n, ChessPiece[][] positions) {
        this.M = m;
        this.N = n;
        this.positions = positions;
    }

    private void initializePositions(int m, int n) {
        this.positions = new ChessPiece[M][N];
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                positions[row][col] = new NoPiece(row, col);
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

    public Board place(ChessPiece piece) {
        this.positions[piece.getRow()][piece.getCol()] = piece;
        return new Board(M,N,positions);
    }

    public ChessPiece findPiece(int row, int col) {
        return positions[row][col];
    }

    public List<ChessPiece> emptyPositions() {
        List<ChessPiece> emptyPositions = new ArrayList<>();
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                ChessPiece position = this.positions[i][j];
                if (position.toString().equals("_")) {
                    emptyPositions.add(position);
                }
            }
        }
        return emptyPositions;
    }

    public List<ChessPiece> placedPositions() {
        List<ChessPiece> placedPositions = new ArrayList<>();
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                ChessPiece position = this.positions[i][j];
                if (!position.toString().equals("_")) {
                    placedPositions.add(position);
                }
            }
        }
        return placedPositions;
    }

    public boolean isSafe(ChessPiece c) {
        System.out.println("HOLA");
        return placedPositions().stream().filter(p -> (!p.attacks(c) || !c.attacks(p))).count()==0;
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
}
