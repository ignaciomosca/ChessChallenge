package chess.algorithm;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;
import com.trycatch.chess.pieces.King;
import com.trycatch.chess.pieces.Knight;
import com.trycatch.chess.pieces.Rook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ignacio on 19/08/16.
 */
public class ChessChallengeSolverTest {

    @Test
    public void test3x3Board2Kings1Rook() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"3", "3", "K:2;R:1"});
        List<String> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        Set<Board> solutions = new HashSet<>();
        Set<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        Set<Board> expected = solution3x3Board2Kings1Rook();
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void test4x4Board2Rooks4Knights() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"4", "4", "N:4;R:2"});
        List<String> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        Set<Board> solutions = new HashSet<>();
        Set<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions);
        Set<Board> expected = solution4x4Board2Rooks4Knights();
        Assert.assertTrue(actual.equals(expected));
    }

    private Set<Board> solution3x3Board2Kings1Rook() {
        Set<Board> solutions = new HashSet<>(4);
        solutions.add(new Board(4, 4, new HashSet<>(Arrays.asList(new King(1, 1),
                new King(1, 3),
                new Rook(3, 2)))));
        solutions.add(new Board(4, 4, new HashSet<>(Arrays.asList(new King(1, 1),
                new King(3, 1),
                new Rook(2, 3)))));
        solutions.add(new Board(4, 4, new HashSet<>(Arrays.asList(new King(1, 3),
                new King(3, 3),
                new Rook(2, 1)))));
        solutions.add(new Board(4, 4, new HashSet<>(Arrays.asList(new King(3, 1),
                new King(3, 3),
                new Rook(1, 2)))));
        return solutions;
    }

    private Set<Board> solution4x4Board2Rooks4Knights() {
        Set<Board> solutions = new HashSet<>(8);

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(1, 1),
                new Knight(1, 3),
                new Knight(3, 1),
                new Knight(3, 3),
                new Rook(2, 2),
                new Rook(4, 4)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(1, 1),
                new Knight(1, 3),
                new Knight(3, 1),
                new Knight(3, 3),
                new Rook(2, 4),
                new Rook(4, 2)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(1, 2),
                new Knight(1, 4),
                new Knight(3,2),
                new Knight(3, 4),
                new Rook(2, 1),
                new Rook(4, 3)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(1, 2),
                new Knight(1, 4),
                new Knight(3, 2),
                new Knight(3, 4),
                new Rook(2, 3),
                new Rook(4, 1)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(2, 1),
                new Knight(2, 3),
                new Knight(4, 1),
                new Knight(4, 3),
                new Rook(1, 2),
                new Rook(3, 4)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(2, 1),
                new Knight(2, 3),
                new Knight(4, 1),
                new Knight(4, 3),
                new Rook(1, 4),
                new Rook(3, 2)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(2, 2),
                new Knight(2, 4),
                new Knight(4, 2),
                new Knight(4, 4),
                new Rook(1, 1),
                new Rook(3, 3)))));

        solutions.add(new Board(5, 5, new HashSet<>(Arrays.asList(new Knight(2, 2),
                new Knight(2, 4),
                new Knight(4, 2),
                new Knight(4, 4),
                new Rook(3, 1),
                new Rook(1, 3)))));

        return solutions;
    }

}
