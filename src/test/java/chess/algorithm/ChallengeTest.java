package chess.algorithm;

import com.test.chess.board.Board;
import com.test.chess.inputvalidation.BoardPieces;
import com.test.chess.inputvalidation.Validation;
import com.test.test.algorithm.ChessChallengeSolver;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChallengeTest {
    @Test
    public void testChallenge() {
        BoardPieces boardPieces = Validation.parseInput(new String[]{"7", "7", "K:2;Q:2;B:2;N:1"});
        List<Character> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        long startTime = System.currentTimeMillis();
        Set<Board> actualSolutions = ChessChallengeSolver.solution(board, pieces, new HashSet<>(), new HashSet<>());
        long finishTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (finishTime - startTime) + " ms");
        //actualSolutions.forEach(Board::showBoard); // uncomment to see each of the configurations
        Assert.assertEquals(3063828, actualSolutions.size());
    }
}