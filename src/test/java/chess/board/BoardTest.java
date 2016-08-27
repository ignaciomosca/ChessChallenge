package chess.board;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.pieces.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents and MxN Chess board
 * Created by ignacio on 19/08/16.
 */
public class BoardTest {

    @Test
    public void testSamePiece() throws Exception{
        King kingA = new King(1,1);
        King kingB = new King(1,1);
        Assert.assertEquals(kingA,kingB);
    }

    @Test
    public void testDifferentPiece() throws Exception{
        King king = new King(1,1);
        Bishop bishop = new Bishop(1,1);
        Assert.assertNotEquals(king,bishop);
    }

    @Test
    public void testSameBoard() throws Exception{
        Board boardA = new Board(6,6, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Board boardB = new Board(6,6, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Assert.assertEquals(boardA,boardB);
    }

    @Test
    public void testSetContainsBoards() throws Exception{
        Board boardA = new Board(6,6, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Board boardB = new Board(6,6, new HashSet<>(Arrays.asList(new King(1,3), new Queen(3,2))));
        Board boardC = new Board(6,6, new HashSet<>(Arrays.asList(new King(5,5), new Queen(4,4))));
        Board boardD = new Board(6,6, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Set<Board> setA = new HashSet<>(Arrays.asList(boardA, boardB, boardC));
        Assert.assertTrue(setA.contains(boardD));
    }

    @Test
    public void testHashBishop() throws Exception{
        Bishop bishopA = new Bishop(1,1);
        Bishop bishopB = new Bishop(1,1);
        Bishop bishopC = new Bishop(1,2);
        King kingA = new King(1,1);
        Assert.assertTrue(bishopA.hashCode()==bishopB.hashCode());
        Assert.assertTrue(bishopA.hashCode()!=bishopC.hashCode());
        Assert.assertTrue(bishopA.hashCode()!=kingA.hashCode());
    }


}
