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

import java.util.*;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolverTest {

    @Test
    public void test3x3Board2Kings1Rook() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"3", "3", "K:2;R:1"});
        List<ChessPiece> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        List<Board> solutions = new ArrayList<>();
        List<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        List<Board> expected = solution3x3Board2Kings1Rook();
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(actual.get(i).equals(expected.get(i)));
        }
    }

    @Test
    public void test4x4Board2Rooks4Knights() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"4", "4", "N:4;R:2"});
        List<ChessPiece> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        List<Board> solutions = new ArrayList<>();
        List<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        List<Board> expected = solution4x4Board2Rooks4Knights();
        for (int i = 0; i < 8; i++) {
            System.out.println("Test " + (i+1));
            actual.get(i).showBoard();
            expected.get(i).showBoard();
            Assert.assertTrue(actual.get(i).equals(expected.get(i)));
        }
    }

    private List<Board> solution3x3Board2Kings1Rook() {
        List<Board> solutions = new ArrayList<>(4);
        Board boardA = new Board(4, 4, 3);
        boardA.setPositions(Arrays.asList(new King(1, 1),
                new King(1, 3),
                new Rook(3, 2)));
        solutions.add(boardA);

        Board boardB = new Board(4, 4, 3);
        boardB.setPositions(Arrays.asList(new King(1, 1),
                new King(3, 1),
                new Rook(2, 3)));
        solutions.add(boardB);

        Board boardC = new Board(4, 4, 3);
        boardC.setPositions(Arrays.asList(new King(1, 3),
                new King(3, 3),
                new Rook(2, 1)));
        solutions.add(boardC);

        Board boardD = new Board(4, 4, 3);
        boardD.setPositions(Arrays.asList(new King(3, 1),
                new King(3, 3),
                new Rook(1, 2)));
        solutions.add(boardD);

        return solutions;
    }

    private List<Board> solution4x4Board2Rooks4Knights() {
        List<Board> solutions = new ArrayList<>(8);

        Board boardA = new Board(5, 5, 6);
        boardA.setPositions(Arrays.asList(new Knight(1, 1),
                new Knight(1, 3),
                new Knight(3, 1),
                new Knight(3, 3),
                new Rook(2, 2),
                new Rook(4, 4)));
        solutions.add(boardA);

        Board boardB = new Board(5, 5, 6);
        boardB.setPositions(Arrays.asList(new Knight(1, 1),
                new Knight(1, 3),
                new Knight(3, 1),
                new Knight(3, 3),
                new Rook(2, 4),
                new Rook(4, 2)));
        solutions.add(boardB);

        Board boardC = new Board(5, 5, 6);
        boardC.setPositions(Arrays.asList(new Knight(1, 2),
                new Knight(1, 4),
                new Knight(3,2),
                new Knight(3, 4),
                new Rook(2, 1),
                new Rook(4, 3)));
        solutions.add(boardC);

        Board boardD = new Board(5, 5, 6);
        boardD.setPositions(Arrays.asList(new Knight(1, 2),
                new Knight(1, 4),
                new Knight(3, 2),
                new Knight(3, 4),
                new Rook(2, 3),
                new Rook(4, 1)));
        solutions.add(boardD);

        Board boardE = new Board(5, 5, 6);
        boardE.setPositions(Arrays.asList(new Knight(2, 1),
                new Knight(2, 3),
                new Knight(4, 1),
                new Knight(4, 3),
                new Rook(1, 2),
                new Rook(3, 4)));
        solutions.add(boardE);

        Board boardF = new Board(5, 5, 6);
        boardF.setPositions(Arrays.asList(new Knight(2, 1),
                new Knight(2, 3),
                new Knight(4, 1),
                new Knight(4, 3),
                new Rook(1, 4),
                new Rook(3, 2)));
        solutions.add(boardF);

        Board boardG = new Board(5, 5, 6);
        boardG.setPositions(Arrays.asList(new Knight(2, 2),
                new Knight(2, 4),
                new Knight(4, 2),
                new Knight(4, 4),
                new Rook(1, 1),
                new Rook(3, 3)));
        solutions.add(boardG);

        Board boardH = new Board(5, 5, 6);
        boardH.setPositions(Arrays.asList(new Knight(2, 2),
                new Knight(2, 4),
                new Knight(4, 2),
                new Knight(4, 4),
                new Rook(3, 1),
                new Rook(1, 3)));
        solutions.add(boardH);

        return solutions;
    }

}
