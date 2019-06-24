package chess.algorithm;

import com.test.test.algorithm.ChessChallengeSolver;
import com.test.chess.board.Board;
import com.test.chess.inputvalidation.BoardPieces;
import com.test.chess.inputvalidation.Validation;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * To measure performance I ran the 8 queens code with a modified Main class that generated the test from the results.
 * Because the Answer to the 8-Queens problem is already known (92 solutions), I can test if the algorithm is correct for these initial conditions.
 * It is important to remember that the absence of evidence is not evidence of absence, this class does not intend to test for correctness
 * but to measure the impact in performance of different approaches to solving this problem
 * Created by ignacio on 8/23/16.
 */
public class TestNQueen {
    @Test
    public void testNQueen() throws Exception {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"8", "8", "Q:8"});
        List<Character> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        long startTime = System.currentTimeMillis();
        Set<Board> actualSolutions = ChessChallengeSolver.solution(board, pieces, new HashSet<>(), new HashSet<>());
        long finishTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (finishTime - startTime) + " ms");
        actualSolutions.forEach(Board::showBoard);
        Assert.assertTrue(92==actualSolutions.size());
    }
}
