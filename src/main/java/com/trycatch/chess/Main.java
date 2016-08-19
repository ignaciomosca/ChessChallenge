package com.trycatch.chess;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.exceptions.UndefinedPieceException;
import com.trycatch.chess.inputValidation.Validation;
import com.trycatch.chess.pieces.ChessPiece;

import java.util.Arrays;
import java.util.List;


/**
 * Created by ignacio on 19/08/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int M = Integer.parseInt(args[0])+1;
            int N = Integer.parseInt(args[1])+1;
            String piecesInput = args[2];
            Board initialBoard = new Board(M,N);
            List<ChessPiece> pieces = Validation.parsePieces(piecesInput);
            List<Board> solutions = solution(initialBoard, pieces);
            solutions.forEach(Board::showBoard);
        } catch (UndefinedPieceException e) {
            e.printStackTrace();
        }
    }

    private static List<Board> solution(Board initialBoard, List<ChessPiece> pieces) {
        return Arrays.asList(initialBoard);
    }

    private static Board getSolution(Board board, List<ChessPiece> pieceNames) {
        return null;
    }


}




