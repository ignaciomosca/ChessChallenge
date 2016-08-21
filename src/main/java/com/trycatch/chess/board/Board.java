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
    private int initialNumberOfPieces;
    private List<ChessPiece> usedPieces;

    public Board(int m, int n, int initialNumberOfPieces) {
        this.M = m;
        this.N = n;
        this.initialNumberOfPieces = initialNumberOfPieces;
        this.usedPieces = new ArrayList<>();
        initializePositions(m, n);
    }

    public Board(int m, int n, int initialNumberOfPieces, List<ChessPiece> chessPieces) {
        this.M = m;
        this.N = n;
        this.initialNumberOfPieces = initialNumberOfPieces;
        initializePositions(M,N);
        setPositions(chessPieces);
    }

    public ChessPiece[][] setPositions(List<ChessPiece> chessPieces) {
        this.usedPieces = new ArrayList<>();
        for (ChessPiece c : chessPieces) {
            positions[c.getRow()][c.getCol()] = c;
            this.usedPieces.add(c);
        }
        return this.positions;
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
        Board board = new Board(M, N, initialNumberOfPieces, this.placedPositions());
        board.usedPieces.add(piece);
        board.positions[piece.getRow()][piece.getCol()] = piece;
        return board;
    }

    public ChessPiece findPiece(int row, int col) {
        return positions[row][col];
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
        return placedPositions().stream().filter(p -> (p.attacks(c) || c.attacks(p))).count() == 0;
    }

    public void remove(ChessPiece piece) {
        this.usedPieces.remove(piece);
        this.positions[piece.getRow()][piece.getCol()] = new NoPiece(piece.getRow(), piece.getCol());
    }

    public boolean isValidSolution() {
        return this.initialNumberOfPieces == this.usedPieces.size();
    }

    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    public boolean samePieces(ChessPiece[][] positionsA, ChessPiece[][] positionsB){
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                if(!positionsA[i][j].equals(positionsB[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (M != board.M) return false;
        if (N != board.N) return false;
        return positions != null ? samePieces(positions,board.positions) : board.positions == null;
    }

}
