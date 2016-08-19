package com.trycatch.chess;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.inputValidation.Validation;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ignacio on 19/08/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int M = Integer.parseInt(args[0]);
            int N = Integer.parseInt(args[1]);
            String piecesInput = args[2];
            List<ChessPiece> pieces = Validation.parsePieces(piecesInput);
            List<Board> solutions = solution(M, N, pieces);
            solutions.forEach(Main::showBoard);
        } catch (UndefinedPieceException e) {
            e.printStackTrace();
        }
    }

    public static List<Board> solution(int M, int N, List<ChessPiece> pieceNames){
        List<Board> solutions = new ArrayList<>();
        Board solution = getSolution(M,N,pieceNames);
        solutions.add(solution);
        return solutions;
    }

    private static Board getSolution(int m, int n, List<ChessPiece> pieceNames) {
        return null;
    }

    public static void showBoard(Board board){

    }



}
