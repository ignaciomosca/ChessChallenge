package chess.algorithm;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;
import com.trycatch.chess.pieces.ChessPiece;
import com.trycatch.chess.pieces.King;
import com.trycatch.chess.pieces.Knight;
import com.trycatch.chess.pieces.Rook;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolverTest {

    @Test
    public void test3x3Board2Kings1Rook() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"3","3","K:2;R:1"});
        List<ChessPiece> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        List<Board> solutions = new ArrayList<>();
        List<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        List<Board> expected = solution3x3Board2Kings1Rook();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4x4Board2Rooks4Knights() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"4","4","N:4;R:2"});
        List<ChessPiece> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        List<Board> solutions = new ArrayList<>();
        List<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        List<Board> expected = solution4x4Board2Rooks4Knights();
        Assert.assertEquals(expected, actual);
    }

    private List<Board> solution3x3Board2Kings1Rook() {
        List<Board> solutions = new ArrayList<>(4);
        Board boardA = new Board(4, 4, 3);
        boardA.place(new King(1, 1));
        boardA.place(new King(1, 3));
        boardA.place(new Rook(3, 2));
        solutions.add(boardA);

        Board boardB = new Board(4, 4, 3);
        boardB.place(new King(1, 1));
        boardB.place(new King(3, 1));
        boardB.place(new Rook(2, 3));
        solutions.add(boardB);

        Board boardC = new Board(4, 4, 3);
        boardC.place(new King(1, 3));
        boardC.place(new King(3, 3));
        boardC.place(new Rook(2, 1));
        solutions.add(boardC);

        Board boardD = new Board(4, 4, 3);
        boardD.place(new King(3, 1));
        boardD.place(new King(3, 3));
        boardD.place(new Rook(1, 2));
        solutions.add(boardD);

        return solutions;
    }
    private List<Board> solution4x4Board2Rooks4Knights() {
        List<Board> solutions = new ArrayList<>(8);
        Board boardA = new Board(5, 5, 6);
        boardA.place(new Knight(1, 2));
        boardA.place(new Knight(1, 4));
        boardA.place(new Knight(3, 2));
        boardA.place(new Knight(3, 4));
        boardA.place(new Rook(2, 3));
        boardA.place(new Rook(4, 1));
        solutions.add(boardA);

        Board boardB = new Board(5, 5, 6);
        boardB.place(new Knight(2, 1));
        boardB.place(new Knight(1, 4));
        boardB.place(new Knight(3, 2));
        boardB.place(new Knight(3, 4));
        boardB.place(new Rook(1, 3));
        boardB.place(new Rook(4, 3));
        solutions.add(boardB);

        Board boardC = new Board(5, 5, 6);
        boardC.place(new Knight(2, 2));
        boardC.place(new Knight(2, 4));
        boardC.place(new Knight(4, 2));
        boardC.place(new Knight(4, 4));
        boardC.place(new Rook(1, 1));
        boardC.place(new Rook(3, 3));
        solutions.add(boardC);

        Board boardD = new Board(5, 5, 6);
        boardD.place(new Knight(2, 2));
        boardD.place(new Knight(2, 4));
        boardD.place(new Knight(4, 2));
        boardD.place(new Knight(4, 4));
        boardD.place(new Rook(3, 1));
        boardD.place(new Rook(1, 3));
        solutions.add(boardD);

        Board boardE = new Board(5, 5, 6);
        boardE.place(new Knight(2, 1));
        boardE.place(new Knight(2, 3));
        boardE.place(new Knight(4, 1));
        boardE.place(new Knight(4, 3));
        boardE.place(new Rook(1, 2));
        boardE.place(new Rook(3, 4));
        solutions.add(boardE);

        Board boardF = new Board(5, 5, 6);
        boardF.place(new Knight(2, 1));
        boardF.place(new Knight(2, 3));
        boardF.place(new Knight(4, 1));
        boardF.place(new Knight(4, 3));
        boardF.place(new Rook(1, 4));
        boardF.place(new Rook(3, 2));
        solutions.add(boardF);

        Board boardG = new Board(5, 5, 6);
        boardG.place(new Knight(1, 1));
        boardG.place(new Knight(1, 3));
        boardG.place(new Knight(3, 1));
        boardG.place(new Knight(3, 3));
        boardG.place(new Rook(2, 4));
        boardG.place(new Rook(4, 2));
        solutions.add(boardG);

        Board boardH = new Board(5, 5, 6);
        boardH.place(new Knight(1, 1));
        boardH.place(new Knight(1, 3));
        boardH.place(new Knight(3, 1));
        boardH.place(new Knight(3, 3));
        boardH.place(new Rook(2, 2));
        boardH.place(new Rook(4, 4));
        solutions.add(boardH);


        return solutions;
    }

}
