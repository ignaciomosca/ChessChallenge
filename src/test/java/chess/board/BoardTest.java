package chess.board;

import com.trycatch.chess.board.Board;
import com.trycatch.chess.pieces.Bishop;
import com.trycatch.chess.pieces.King;
import com.trycatch.chess.pieces.Queen;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

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
        Board boardA = new Board(5,5, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Board boardB = new Board(5,5, new HashSet<>(Arrays.asList(new King(1,1), new Queen(2,2))));
        Assert.assertEquals(boardA,boardB);
    }


}
