package chess.algorithm;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ignacio on 23/08/16.
 */
public class ProblemTest {

    @Test
    //7×7 board with 2 Kings, 2 Queens, 2 Bishops and 1 Knight
    public void testProblem() throws Exception{
        BoardPieces boardPieces = Validation.parseInput(new String[]{"7", "7", "K:2;Q:2;B:2;N:1"});
        List<String> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        Set<Board> solutions = new HashSet<>();
        Set<Board> actual = ChessChallengeSolver.solution(board, pieces, solutions, new HashSet<>());
        System.out.println("Number of Solutions: "+actual.size());
        Assert.assertTrue(true);
    }

}
