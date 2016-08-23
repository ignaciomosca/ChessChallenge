package chess.algorithm;

import com.trycatch.chess.algorithm.ChessChallengeSolver;
import com.trycatch.chess.board.Board;
import com.trycatch.chess.inputvalidation.BoardPieces;
import com.trycatch.chess.inputvalidation.Validation;
import com.trycatch.chess.pieces.Queen;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
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
        List<String> pieces = boardPieces.getPieces();
        Board board = boardPieces.getBoard();
        Set<Board> expectedSolutions = solutions();
        Set<Board> actualSolutions = ChessChallengeSolver.solution(board, pieces, new HashSet<>(), new HashSet<>());
        Assert.assertTrue(actualSolutions.size()==expectedSolutions.size());
    }

    private Set<Board> solutions(){
        Set<Board> solutions = new HashSet<>();
        //Test 1
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,1),
                new Queen(5,7),
                new Queen(4,6),
                new Queen(2,5),
                new Queen(3,8),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(5,3)))));
        //Test 2
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(5,7),
                new Queen(1,3),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(4,1)))));
        //Test 3
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,6),
                new Queen(5,8),
                new Queen(1,4),
                new Queen(3,7),
                new Queen(7,1),
                new Queen(8,5),
                new Queen(4,3)))));
        //Test 4
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(7,8),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(2,7),
                new Queen(8,2),
                new Queen(5,1),
                new Queen(4,3)))));
        //Test 5
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(2,8),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(8,6),
                new Queen(4,3)))));
        //Test 6
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(4,5),
                new Queen(2,4),
                new Queen(5,8),
                new Queen(1,6),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(3,1)))));
        //Test 7
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(8,8),
                new Queen(5,6),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(2,7),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(4,2)))));
        //Test 8
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(7,8),
                new Queen(3,6),
                new Queen(1,7),
                new Queen(5,1),
                new Queen(8,5),
                new Queen(5,4),
                new Queen(4,3)))));
        //Test 9
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,6),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(4,8),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,7)))));
        //Test 10
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(7,8),
                new Queen(1,3),
                new Queen(4,7),
                new Queen(2,6),
                new Queen(5,1),
                new Queen(8,4),
                new Queen(3,2)))));
        //Test 11
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(8,8),
                new Queen(2,3),
                new Queen(3,5),
                new Queen(4,7),
                new Queen(1,6),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(5,4)))));
        //Test 12
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,3),
                new Queen(1,4),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(7,1),
                new Queen(5,2),
                new Queen(8,6),
                new Queen(5,5)))));
        //Test 13
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(5,6),
                new Queen(1,4),
                new Queen(2,8),
                new Queen(5,2),
                new Queen(8,5),
                new Queen(3,1),
                new Queen(4,3)))));
        //Test 14
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,1),
                new Queen(3,4),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(2,7),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(7,5)))));
        //Test 15
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,1),
                new Queen(3,5),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(5,4),
                new Queen(7,6)))));
        //Test 16
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,8),
                new Queen(1,3),
                new Queen(4,7),
                new Queen(2,6),
                new Queen(5,1),
                new Queen(8,5),
                new Queen(5,4),
                new Queen(3,2)))));
        //Test 17
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,7),
                new Queen(3,5),
                new Queen(1,8),
                new Queen(5,1),
                new Queen(7,4),
                new Queen(8,6),
                new Queen(4,3)))));
        //Test 18
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(3,4),
                new Queen(1,3),
                new Queen(4,7),
                new Queen(2,8),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(8,5)))));
        //Test 19
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(7,8),
                new Queen(5,7),
                new Queen(3,6),
                new Queen(1,5),
                new Queen(8,3),
                new Queen(4,1),
                new Queen(5,4)))));
        //Test 20
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(5,7),
                new Queen(1,3),
                new Queen(2,5),
                new Queen(3,8),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(8,6)))));
        //Test 21
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(1,3),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(5,1),
                new Queen(8,5),
                new Queen(4,2),
                new Queen(5,4)))));
        //Test 22
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(5,7),
                new Queen(1,5),
                new Queen(3,8),
                new Queen(7,3),
                new Queen(5,2),
                new Queen(8,6),
                new Queen(2,1)))));
        //Test 23
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(7,6)))));
        //Test 24
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(1,7),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(3,1),
                new Queen(5,5)))));
        //Test 25
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(3,4),
                new Queen(5,8),
                new Queen(1,7),
                new Queen(7,3),
                new Queen(4,1),
                new Queen(8,6),
                new Queen(5,5)))));
        //Test 26
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,4),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(8,2),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(7,6)))));
        //Test 27
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(5,7),
                new Queen(2,4),
                new Queen(4,8),
                new Queen(1,6),
                new Queen(7,1),
                new Queen(8,3),
                new Queen(3,2)))));
        //Test 28
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(7,1),
                new Queen(8,5),
                new Queen(4,2),
                new Queen(5,4)))));
        //Test 29
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(3,4),
                new Queen(1,3),
                new Queen(5,8),
                new Queen(2,6),
                new Queen(8,1),
                new Queen(4,2),
                new Queen(5,5)))));
        //Test 30
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(3,5),
                new Queen(5,8),
                new Queen(1,6),
                new Queen(8,4),
                new Queen(5,3),
                new Queen(4,2),
                new Queen(2,1)))));
        //Test 31
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(4,8),
                new Queen(7,3),
                new Queen(5,2),
                new Queen(8,6),
                new Queen(2,1)))));
        //Test 32
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(8,3),
                new Queen(4,1),
                new Queen(7,5),
                new Queen(5,4)))));
        //Test 33
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(8,2),
                new Queen(7,4),
                new Queen(3,1),
                new Queen(4,3)))));
        //Test 34
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(5,8),
                new Queen(4,7),
                new Queen(1,5),
                new Queen(8,4),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(7,6)))));
        //Test 35
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(1,2),
                new Queen(2,4),
                new Queen(3,6),
                new Queen(4,8),
                new Queen(5,1),
                new Queen(8,5),
                new Queen(5,3)))));
        //Test 36
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(2,3),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(8,5)))));
        //Test 37
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,5),
                new Queen(5,8),
                new Queen(1,4),
                new Queen(2,6),
                new Queen(7,3),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(8,7)))));
        //Test 38
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(1,4),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(7,6)))));
        //Test 39
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(2,3),
                new Queen(5,7),
                new Queen(1,5),
                new Queen(3,8),
                new Queen(8,2),
                new Queen(5,1),
                new Queen(7,6)))));
        //Test 40
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(8,8),
                new Queen(4,6),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(5,1),
                new Queen(7,4),
                new Queen(5,3),
                new Queen(3,2)))));
        //Test 41
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(1,2),
                new Queen(3,6),
                new Queen(2,8),
                new Queen(8,4),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(5,5)))));
        //Test 42
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,5),
                new Queen(1,3),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(5,2),
                new Queen(7,4),
                new Queen(8,6),
                new Queen(2,1)))));
        //Test 43
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(7,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(8,4),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(5,5)))));
        //Test 44
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,6),
                new Queen(5,8),
                new Queen(1,4),
                new Queen(3,7),
                new Queen(8,1),
                new Queen(7,5),
                new Queen(4,3)))));
        //Test 45
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(1,3),
                new Queen(2,5),
                new Queen(4,8),
                new Queen(5,1),
                new Queen(7,4),
                new Queen(8,6),
                new Queen(3,2)))));
        //Test 46
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,8),
                new Queen(1,3),
                new Queen(2,5),
                new Queen(3,7),
                new Queen(5,2),
                new Queen(4,1),
                new Queen(8,6),
                new Queen(5,4)))));
        //Test 47
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(2,3),
                new Queen(3,8),
                new Queen(1,7),
                new Queen(5,1),
                new Queen(8,4),
                new Queen(4,2),
                new Queen(7,6)))));
        //Test 48
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(5,7),
                new Queen(1,5),
                new Queen(3,8),
                new Queen(7,3),
                new Queen(4,1),
                new Queen(8,6),
                new Queen(5,4)))));
        //Test 49
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,5),
                new Queen(2,4),
                new Queen(5,8),
                new Queen(1,7),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,6),
                new Queen(3,2)))));
        //Test 50
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,4),
                new Queen(5,7),
                new Queen(1,5),
                new Queen(2,8),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(4,1),
                new Queen(7,6)))));
        //Test 51
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(5,2),
                new Queen(7,4),
                new Queen(3,1),
                new Queen(8,7)))));
        //Test 52
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(1,3),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(8,2),
                new Queen(4,1),
                new Queen(7,5),
                new Queen(5,4)))));
        //Test 53
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(4,6),
                new Queen(1,5),
                new Queen(3,8),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(5,3),
                new Queen(2,1)))));
        //Test 54
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,8),
                new Queen(4,6),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(5,1),
                new Queen(8,4),
                new Queen(5,3),
                new Queen(3,2)))));
        //Test 55
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(4,6),
                new Queen(1,4),
                new Queen(3,8),
                new Queen(5,1),
                new Queen(5,3),
                new Queen(7,5),
                new Queen(8,7)))));
        //Test 56
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(1,4),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,5),
                new Queen(4,2)))));
        //Test 57
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(1,3),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(7,1),
                new Queen(8,5),
                new Queen(5,4),
                new Queen(3,2)))));
        //Test 58
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,2),
                new Queen(5,8),
                new Queen(2,5),
                new Queen(3,7),
                new Queen(8,4),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(7,6)))));
        //Test 59
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(1,2),
                new Queen(5,8),
                new Queen(2,5),
                new Queen(3,7),
                new Queen(8,3),
                new Queen(5,1),
                new Queen(7,6)))));
        //Test 60
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,4),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(4,1),
                new Queen(7,5)))));
        //Test 61
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(2,7),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,6),
                new Queen(3,2)))));
        //Test 62
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(4,5),
                new Queen(5,7),
                new Queen(1,4),
                new Queen(3,8),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,6)))));
        //Test 63
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,5),
                new Queen(5,7),
                new Queen(1,4),
                new Queen(2,8),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(7,6)))));
        //Test 64
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(3,4),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(7,1),
                new Queen(5,3),
                new Queen(8,7)))));
        //Test 65
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(4,4),
                new Queen(5,7),
                new Queen(1,6),
                new Queen(2,8),
                new Queen(8,3),
                new Queen(5,1),
                new Queen(7,5),
                new Queen(3,2)))));
        //Test 66
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(1,3),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(5,1),
                new Queen(7,4),
                new Queen(8,6),
                new Queen(3,2)))));
        //Test 67
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,7),
                new Queen(1,4),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(8,2),
                new Queen(5,1),
                new Queen(7,5),
                new Queen(4,3)))));
        //Test 68
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(2,3),
                new Queen(4,8),
                new Queen(1,6),
                new Queen(5,2),
                new Queen(7,4),
                new Queen(3,1),
                new Queen(8,7)))));
        //Test 69
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(5,6),
                new Queen(3,5),
                new Queen(1,4),
                new Queen(4,8),
                new Queen(8,2),
                new Queen(5,3),
                new Queen(2,1)))));
        //Test 70
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,2),
                new Queen(5,8),
                new Queen(4,7),
                new Queen(2,6),
                new Queen(7,3),
                new Queen(8,5),
                new Queen(3,1),
                new Queen(5,4)))));
        //Test 71
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(1,2),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(5,1),
                new Queen(8,5),
                new Queen(5,4),
                new Queen(4,3)))));
        //Test 72
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(5,8),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(7,1),
                new Queen(8,4),
                new Queen(4,2),
                new Queen(5,5)))));
        //Test 73
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(3,4),
                new Queen(5,7),
                new Queen(1,8),
                new Queen(7,3),
                new Queen(4,1),
                new Queen(8,6),
                new Queen(5,5)))));
        //Test 74
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(3,4),
                new Queen(1,5),
                new Queen(2,8),
                new Queen(7,2),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(8,7)))));
        //Test 75
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(3,4),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(1,5),
                new Queen(8,3),
                new Queen(5,2),
                new Queen(2,1)))));
        //Test 76
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(3,4),
                new Queen(5,8),
                new Queen(4,7),
                new Queen(1,5),
                new Queen(8,1),
                new Queen(5,3),
                new Queen(7,6)))));
        //Test 77
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,3),
                new Queen(5,6),
                new Queen(5,8),
                new Queen(2,5),
                new Queen(1,7),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(4,1)))));
        //Test 78
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,5),
                new Queen(2,3),
                new Queen(5,8),
                new Queen(4,7),
                new Queen(1,6),
                new Queen(7,2),
                new Queen(8,4),
                new Queen(3,1)))));
        //Test 79
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,3),
                new Queen(3,5),
                new Queen(4,8),
                new Queen(1,6),
                new Queen(7,2),
                new Queen(5,1),
                new Queen(5,4),
                new Queen(8,7)))));
        //Test 80
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,3),
                new Queen(1,2),
                new Queen(4,6),
                new Queen(5,8),
                new Queen(2,7),
                new Queen(7,1),
                new Queen(8,4),
                new Queen(5,5)))));
        //Test 81
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(5,6),
                new Queen(2,4),
                new Queen(4,8),
                new Queen(1,7),
                new Queen(5,1),
                new Queen(7,3),
                new Queen(8,5),
                new Queen(3,2)))));
        //Test 82
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(2,3),
                new Queen(4,6),
                new Queen(1,8),
                new Queen(8,4),
                new Queen(5,2),
                new Queen(3,1),
                new Queen(5,5)))));
        //Test 83
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(2,3),
                new Queen(4,8),
                new Queen(1,6),
                new Queen(5,2),
                new Queen(8,5),
                new Queen(3,1),
                new Queen(5,4)))));
        //Test 84
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(3,3),
                new Queen(5,6),
                new Queen(4,8),
                new Queen(1,7),
                new Queen(7,2),
                new Queen(8,5),
                new Queen(5,4),
                new Queen(2,1)))));
        //Test 85
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(4,5),
                new Queen(1,3),
                new Queen(5,8),
                new Queen(2,6),
                new Queen(5,1),
                new Queen(8,4),
                new Queen(3,2)))));
        //Test 86
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(8,8),
                new Queen(2,4),
                new Queen(3,7),
                new Queen(1,6),
                new Queen(7,2),
                new Queen(4,1),
                new Queen(5,3),
                new Queen(5,5)))));
        //Test 87
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(3,4),
                new Queen(1,3),
                new Queen(5,8),
                new Queen(2,6),
                new Queen(8,2),
                new Queen(4,1),
                new Queen(5,5)))));
        //Test 88
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(5,6),
                new Queen(1,3),
                new Queen(2,5),
                new Queen(4,8),
                new Queen(8,1),
                new Queen(5,4),
                new Queen(3,2)))));
        //Test 89
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,2),
                new Queen(3,5),
                new Queen(4,8),
                new Queen(2,7),
                new Queen(8,3),
                new Queen(5,1),
                new Queen(5,4),
                new Queen(7,6)))));
        //Test 90
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(7,7),
                new Queen(5,6),
                new Queen(2,4),
                new Queen(1,8),
                new Queen(5,2),
                new Queen(8,5),
                new Queen(3,1),
                new Queen(4,3)))));
        //Test 91
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(2,2),
                new Queen(4,5),
                new Queen(5,8),
                new Queen(1,4),
                new Queen(3,7),
                new Queen(8,3),
                new Queen(5,1),
                new Queen(7,6)))));
        //Test 92
        solutions.add(new Board(9,9, new HashSet<>(Arrays.asList(
                new Queen(1,1),
                new Queen(5,7),
                new Queen(2,6),
                new Queen(3,8),
                new Queen(7,2),
                new Queen(8,5),
                new Queen(6,4),
                new Queen(4,3)))));
        return solutions;
    }




}
